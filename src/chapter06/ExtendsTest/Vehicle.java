package chapter06.ExtendsTest;

public class Vehicle {
  String color;
  int speed;
  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }
  public void show() {
    System.out.printf("%s 색의 %d 속도를 가진 자동차 입니다. ",color,speed);
  }
}

class Car extends Vehicle {
  int displacement;
  int gears;
  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }
  public void show() {
    System.out.printf("%s 색의 %d 속도를 가진 배기량 %d 의 %d 단의 자동차 입니다. ",color,speed, displacement, gears);
  }

}