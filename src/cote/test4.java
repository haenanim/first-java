package cote;

public class test4 {
  public static void main(String[] args) {
    String number = "123";
    int answer = 0;
    for(int i = 0; i < number.length(); ++i) {
      answer+=number.charAt(i)-48;
    }
    System.out.println(answer);

  }
}
