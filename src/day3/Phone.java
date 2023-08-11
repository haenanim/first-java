package day3;

public class Phone {
  public static long getNumOfPhones() {
    System.out.println(System.identityHashCode(numOfPhones));
    return numOfPhones;
  }
  private static long numOfPhones;
  public Phone(String model, int value) {
    this.model = model;
    this.value = value;
//    numOfPhones++;
  }

  public String model;
  public int value;
  public void print() {
    System.out.println(model+"기종"+value+"만원짜리");
  }
}
