package classExample2;

public class Circle {

  private double radius = 1.0;
  private String color = "빨강";
  public Circle() {}
  public Circle(double radius) {
    this.radius = radius;
  }
  public Circle(String color) {
    this.color = color;
  }
  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public void showStatus() {
    System.out.println("원의 반지름 : "+this.radius + "\n색 : " + this.color);
  }
  public void setRadius(double r) { this.radius = r;}
  public double getRadius() { return this.radius;}

}
