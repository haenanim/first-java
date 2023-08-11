package classExample;

import java.util.Vector;

public class CircleEx {
  public static void main(String[] args) {
    Circle circle = new Circle(4.0);
    Circle circle1 = new Circle(8.0);
    Circle circle2 = new Circle(12.0);
    System.out.println(circle1);
    System.out.println(circle2);

    circle1 = circle2;
    System.out.println(circle1);
    System.out.printf("넓이 :%.2f",circle2.findArea());
    Vector<Circle> circles = new Vector<Circle>();
    circles.add(circle);
    circles.get(0).getRadius();
  }
}
class Circle{
  private double radius = 0.0;
  public Circle(double radius) {
    if(radius > 0.0) {
      this.radius = radius;
    } else {
      System.out.println("0보다 커야함");
    }
  }
  public double getRadius() {
    return radius;
  }
  public double findArea() {
    return Math.PI * this.radius * this.radius;

  }
  public void setRadius(double radius) {
    if(radius > 0.0) {
      this.radius = radius;
    } else {
      System.out.println("0보다 커야함");
    }

  }
}