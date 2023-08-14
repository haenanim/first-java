package chapter05;

public class StringEx4 {
  public static void main(String[] args) {
    String version = String.format("%s %d", "JDK", 14);
    System.out.println(version);
    String fruits = String.join(", ", "apple", "banana", "cherry", "durian");
    String alpha = String.join(", ", "a","b","c","d","e");
    System.out.println(fruits);
    System.out.println(alpha);
    String pi = String.valueOf(3.14);
    System.out.println(pi);
  }
}
