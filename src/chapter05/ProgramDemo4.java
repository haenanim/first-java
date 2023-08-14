package chapter05;

import java.util.Scanner;

public class ProgramDemo4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String url = "";

    while(true) {
      url = input.nextLine();
      if(url.equalsIgnoreCase("bye")) break;
      if(url.toLowerCase().endsWith("com")){
        System.out.println("\'com\' 으로 끝납니다.");
      }
      if(url.toLowerCase().contains(("java"))){
        System.out.println("\'java\'를 포함합니다");
      }
    }
  }
}
