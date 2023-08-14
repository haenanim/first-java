package chapter05;

import classExample2.Circle;

public class CalByRef2 {
  public static void main(String[] args) {
    Circle[] circles = new Circle[5];
    for(int i = 0; i < 5; ++i) {
      circles[i] = new Circle(i+1,"red");
    }
    for(Circle c: circles) {
      c.showStatus();
    }
  }

  void change(Circle c) {
    c.setRadius(c.getRadius()+1.0);
  }
}
