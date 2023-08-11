package day3;

public class Lamp {
  boolean status = false;
  String on = "켜짐";
  String off = "꺼짐";

  public void turnOn() {
    status = true;
  }
  public void turnOff() {
    status = false;
  }
  public void checkSwitch() {
    if(status) {
      System.out.println(on);
    } else {
      System.out.println(off);
    }
  }
}
