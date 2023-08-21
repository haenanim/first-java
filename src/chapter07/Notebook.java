package chapter07;

public class Notebook extends Computer implements Portable{
  @Override
  public void inMyBag() {
    System.out.println("내 가방에 있다.");
  }
}
