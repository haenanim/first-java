package classExample2.circleTest;

public class CircleEx {
  public static void main(String[] args) {
  Circle c1 = new Circle(3, "red");
  Circle c2 = new Circle(4, "RED");
  Circle c3 = new Circle(5,"Yellow");
    System.out.println(Circle.getNumOfCircles());
    System.out.println(Circle.getNumOfRedCircles());
  }


}
