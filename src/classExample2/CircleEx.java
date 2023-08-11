package classExample2;

public class CircleEx {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    Circle c2 = new Circle(5.0);
    Circle c3 = new Circle("파랑");
    Circle c4 = new Circle(12.0, "초록");

    c1.showStatus();
    c2.showStatus();
    c3.showStatus();
    c4.showStatus();
  }
}
