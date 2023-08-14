package chapter05;


import classExample2.Circle;

public class ArrayClassEx1 {
  public static void main(String[] args) {
    Circle[] circles = new Circle[5];
    for(int i = 0; i < circles.length; ++i) {
      circles[i] = new Circle((double)i,i%2==0?"yellow":"red");
    }
    for(int i = 0; i < circles.length; ++i) {
      circles[i].showStatus();
    }
  }
}
