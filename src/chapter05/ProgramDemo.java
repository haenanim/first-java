package chapter05;

import java.util.Scanner;

public class ProgramDemo {
  public static void main(String[] args) {
    //1번문제 입력
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    System.out.print(countChar(str,'a'));
  }

  //1번문제
  static int countChar(String s, char c) {
    int count = 0;
    for(int i = 0; i < s.length(); ++i){
      if(s.toUpperCase().charAt(i) == Character.toUpperCase(c)){
        ++count;
      }
    }
    return count;
  }
}
