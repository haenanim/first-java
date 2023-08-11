package classExample;

public class Animal {
  void breath() {
    System.out.println("숨쉰다");
  }
  void eat() {
    System.out.println("먹는다");
  }
  void move() {
    System.out.println("움직인다");
  }
}

class Bird extends Animal {
  @Override
  void move() {
    System.out.println("날아간다");
  }
  //  void flying(){
//    System.out.println("난다");
//  }
}
class Tiger extends Animal{
  @Override
  void move() {
    System.out.println("달려간다");
  }
  //  void run() {
//    System.out.println("달린다.");
//  }
}
class Fish extends Animal {
  @Override
  void move() {
    System.out.println("헤엄친다");
  }
}
