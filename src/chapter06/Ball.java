package chapter06;

public class Ball extends Circle{
  public double findVolume() {
    return 4/3 * (Math.PI * radius * radius);
  }
}
