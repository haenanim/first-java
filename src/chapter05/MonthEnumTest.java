package chapter05;

public class MonthEnumTest {
  public static void main(String[] args) {
    Month month = Month.JAN;
    Month month1 = Month.JAN;
    System.out.println(month.getMonth());
    System.out.println(month.ordinal());
    System.out.println(month.name());
    System.out.println(month.getThis());
    System.out.println(month1.getThis());
    if(month == month1) {
      System.out.println("같다");
    }
  }
}
