package chapter05;

public class ArrayStringEx {
  public static void main(String[] args) {
    String[] names = new String[3];
    show(names);
    names[0] = "Kim";
    names[1] = "lee";
    names[2] = "Park";
    show(names);
  }
  static void show(String[] names) {
    for(String a:names){
      System.out.println(a);
    }
  }
}
