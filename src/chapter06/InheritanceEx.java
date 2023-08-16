package chapter06;

public class InheritanceEx {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.radius = 1.0;

    Ball ball = new Ball();
    ball.radius = 1.0;

    System.out.printf("%d, %d" ,
        circle.findArea(),
        ball.findArea());
    System.out.printf("%d, %d" ,
        ball.findVolume());
  }
}
