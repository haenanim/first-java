package classExample;

import java.util.Vector;

public class CircleEx {
  public static void main(String[] args) {
    Circle circle = new Circle(4.0);
    System.out.println(circle.getRadius());
    Vector<Circle> circles = new Vector<Circle>();
    circles.add(circle);
    circles.get(0).getRadius();
  }
}
class Circle{
  private double radius = 0.0;
  public Circle(double radius) {
    this.radius = radius;
  }
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}