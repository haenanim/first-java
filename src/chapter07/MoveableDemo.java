package chapter07;

public class MoveableDemo {
  public static void main(String[] args) {
    Movable m = new Car();
    Car car =  new Car();
    car.move(30);
    m.move(20);
    car.show();
    ((Car)m).show();
  }
}
interface Movable {
  void move(int distance);
}

class Car implements Movable {
  @Override
  public void move(int distance) {
    System.out.println(distance + " metter move the Car");
  }
  public void show() {
    System.out.println("This is a Car");
  }
}