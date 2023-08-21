package chapter07;

public class LocalClassDemo {
  //멤버 - 필드
  private String s1 = "외부";
  //멤버 - 메서드
  void method1() {
    //지역변수 - 필드
    int x = 1;
    //지역변수 - 클래스
    class localClass {
      String s2 = "내부";
      public void show() {
        System.out.println("지역클래스입니다.");
      }
    }
  }
  //멤버 - static 메서드
  public static void main(String[] args) {
    LocalClassDemo lcd  = new LocalClassDemo();
    lcd.method1();

  }
  //멤버 -
}
