package chapter07;

import java.util.Arrays;

public class Books {
  public static void main(String[] args) {
    Book[] books = {
        new Book(10000),
        new Book(20000),
        new Book(15000),
        new Book(5000),
        new Book(30000),
    };
    Arrays.sort(books);
    Arrays.toString(books);
//    for(Book book: books) {
//      System.out.println(book.getPrice());
//    }

  }
}

class Book implements Comparable{
  int price;
  Book(int price) {
    this.price = price;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Object o) {
    Book a = o instanceof Book ? ((Book) o) : null;
    return this.getPrice() - a.price;
  }

  @Override
  public String toString() {
    return "Book price = "+price;
  }
}
