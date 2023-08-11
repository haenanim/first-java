package classExample2;

public class TriangleTest {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(10.0, 5.0);
    Triangle triangle1 = new Triangle(5.0, 10.0);
    Triangle triangle2 = new Triangle(4.0, 8.0);
    System.out.println(triangle.isSameArea(triangle1));
    System.out.println(triangle1.isSameArea(triangle2));
    System.out.println(triangle.findArea());
  }
}
