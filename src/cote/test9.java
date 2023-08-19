package cote;

public class test9 {
  public static void main(String[] args) {
    String my_string = "banana";
    String is_prefix = "banava";
    System.out.println(my_string.substring(0,is_prefix.length()).equals(is_prefix) ? 1 : 0);
  }
}
