package chapter05;

import day3.Car;

public class String2CompareEx {
  public static void main(String[] args) {
    String s1 = "Hi, Java";
    String s2 = "Hi, java";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareToIgnoreCase(s2));
    Car c1 = new Car();
    Car c2 = new Car();
    System.out.println(c1==c2);
    System.out.println();

  }
}
