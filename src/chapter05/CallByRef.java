package chapter05;

import classExample2.Circle;

public class CallByRef {
  public static void main(String[] args) {
    Circle c1 = new Circle(10.0,"RED");
    Circle c2 = new Circle(10.0,"RED");
    zero(c1);
    c1.showStatus();
  }

  public static void zero(Circle c){
    c.setRadius(0.0);
  }
  public static void zero(double r){

  }
}
