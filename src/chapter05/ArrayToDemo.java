package chapter05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayToDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();
    int sum = 0;
    while(true) {
      int a = in.nextInt();
      if(a == -1) {
        break;
      }
      scores.add(a);
      sum += a;
    }
    if(scores.size() == 0) {
      System.out.println(0);
    } else {
      System.out.println((double)sum/scores.size());
    }
  }
}
