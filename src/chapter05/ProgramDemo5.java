package chapter05;

import java.util.Scanner;

public class ProgramDemo5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] inputArr = new int[10];
    for(int i = 0; i < 10; ++i) {
      int num = in.nextInt();
      if(num < 0) continue;
      ++inputArr[num/10];
    }
    for(int i = 0; i < 10; ++i) {
      System.out.print(i*10+"~"+(i*10+9)+":");
      for(int j = 0; j < inputArr[i]; ++j){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
