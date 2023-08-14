package chapter05;

import java.util.Scanner;

public class ArrayEx2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] array = {1,2,3,4,5};
    for(int a: array){
      System.out.println(a);
    }
    System.out.println(array);

    char[] cArr = new char[] {'a', 'b', 'c', 'd'};
    System.out.println(cArr);


    int[] score = {0,0,0,0,0};
    int sum = 0;
    for(int i = 0; i < 5; ++i) {
      int inputNum = in.nextInt();
      score[i] = inputNum;
      sum += inputNum;
    }
    System.out.println("총점 : " + sum);
    System.out.println("평균 : " + ((double)sum)/score.length);
  }
}
