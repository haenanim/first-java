package chapter07;

public class VehicleDemo {
  public static void main(String[] args) {
    FireTruck fireTruck = new FireTruck();
    Ambulance ambulance = new Ambulance();
    SecondCar secondCar = new SecondCar();

    Vehicle[] cars = new Vehicle[3];
    cars[0] = fireTruck;
    cars[1] = ambulance;
    cars[2] = secondCar;

    for(int i = 0; i < cars.length; ++i) {
      cars[i].moveFront();
      cars[i].moveBack();
      if(cars[i] instanceof FireTruck) {
        ((FireTruck)cars[i]).shotWater();
      } else if (cars[i] instanceof Ambulance) {
        ((Ambulance)cars[i]).siren();
      } else if (cars[i] instanceof SecondCar) {
        System.out.println("두번째 차 입니다.");
      }
    }

  }
}
interface Vehicle {
  void moveFront();
  void moveBack();

}
class SecondCar implements Vehicle {
  @Override
  public void moveFront() {
    System.out.println("앞으로간다");

  }
  @Override
  public void moveBack() {
    System.out.println("뒤로간다");

  }
}
class FireTruck extends SecondCar {

//  @Override
//  public void moveFront() {
//    System.out.println("앞으로간다");
//  }
//  @Override
//  public void moveBack() {
//    System.out.println("뒤로간다");
//
//  }
  public void shotWater() {
    System.out.println("물뿜기");

  }
}
class Ambulance extends SecondCar {
//  @Override
//  public void moveFront() {
//    System.out.println("앞으로간다");
//
//  }
//  @Override
//  public void moveBack() {
//    System.out.println("뒤로간다");
//
//  }
  public void siren() {
    System.out.println("사이렌");

  }
}
