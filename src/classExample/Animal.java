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
  void flying(){
    System.out.println("난다");
  }
}
class Tiger extends Animal{
  void run() {
    System.out.println("달린다.");
  }
}
