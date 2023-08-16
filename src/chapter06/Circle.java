package chapter06;

public class Circle {
  double radius;
  static String color="white";
  static void setColor(String c) {
    color = c;
  }
  final void changeRadius(double radius) {
    this.radius = radius;
  }
  private void findSecret() {
    System.out.println("비밀입니다");
  }
  protected void findRadius() {
    System.out.println("반지름");
  }
  public double findArea () {
    return Math.PI * radius * radius;
  }
}
