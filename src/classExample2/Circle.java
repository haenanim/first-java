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
    System.out.println(this.radius + this.color);
  }

}
