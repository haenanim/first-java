package chapter05;

public class ArrayClassEx {
  public static void main(String[] args) {
    classExample2.Circle[] circles = new classExample2.Circle[5];
    circles[0] = new classExample2.Circle();
    for(int i = 0; i < circles.length; ++i) {
      if(i < 2){
        circles[i] = new classExample2.Circle();
      }
      System.out.println(circles[i]);
    }
  }
}
