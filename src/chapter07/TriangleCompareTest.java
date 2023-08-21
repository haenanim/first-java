package chapter07;

public class TriangleCompareTest {
  public static void main(String[] args) {
    Tng t1 = new Tng(10,10);
    Tng t2 = new Tng(5,10);
    System.out.println(t1.compareTo(t2));
  }
}
class Tng implements Comparable<Tng>{
  int width;
  int height;
  public Tng(int width, int height) {
    this.height = height;
    this.width = width;
  }
  @Override
  public int compareTo(Tng o) {
    return (int)o.findArea() - (int)this.findArea();
  }
  public double findArea() {
    return (width * height / 2.0);
  }
}
