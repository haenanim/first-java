package day2;

public class MethodEx2 {
  public static void main(String[] args) {
    System.out.println(add(10L, 20L));
    System.out.println(div(10L, 20L));
  }
  static long add(long num1, long num2) {
    return num1 + num2;
  }

  static float div(float num1, float num2) {
    return num1 / num2;
  }
}
