package chapter06.ExtendsTest;

public class Printer {
  static String println(int input) {
    System.out.println(java.lang.String.valueOf(input));
    return java.lang.String.valueOf(input);
  }
  static public String println(boolean input) {
    System.out.println(input?"true" : "false");
    return input?"true" : "false";
  }
  static public String println(double input) {
    double result = ((int)(input * 100.0) / 100.0);
    System.out.println(String.valueOf(result));
    return String.valueOf(result);
  }
  static public String println(String input) {
    System.out.println(input);
    return input;
  }
}
