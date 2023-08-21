package chapter07;

public interface Controllable {
  default void repair(){
    System.out.println("수리한다");
  }
  static void reset() {
    System.out.println("리셋");
  }

  private void show(String s){
    System.out.println(s);
  }
  void turnOn();
  void turnOff();
}
