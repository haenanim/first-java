package chapter07;

public class EagleTest {
  public static void main(String[] args) {
    Bird eagle = new Bird() {
      void fly() {
        System.out.println("독수리가 날아간다");
      }
    };
    eagle.fly();
  }
}

//class Eagle extends Bird {
//  @Override
//  void fly() {
//    System.out.println("독수리가 날아간다");
//  }
//}