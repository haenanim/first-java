package classExample2;

public class Triangle {
  public Triangle (double a, double b) {
    this.a = a;
    this.b = b;
  }
  private double a;
  private double b;

  public double findArea() {
    return a*b/2;
  }
  public boolean isSameArea(Triangle t) {
    return this.findArea() == t.findArea();
  }
}
