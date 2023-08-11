package classExample2.circleTest;

public class Circle {
  private static long numOfCircles;
  private static long numOfRedCircles;

  private double radius;
  private String color;

  public static long getNumOfCircles() {
    return numOfCircles;
  }

  public static long getNumOfRedCircles() {
    return numOfRedCircles;
  }

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
    numOfCircles++;

    if("red".equalsIgnoreCase(color)) {
      numOfRedCircles++;
    }
  }
}
