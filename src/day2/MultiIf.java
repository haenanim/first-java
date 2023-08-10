package day2;

import java.util.Scanner;

public class MultiIf {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int score = -100;
    while (score < 0  || score > 100) {
      System.out.println("점수를 입력 해 주세요(0 ~ 100)");
      score = in.nextInt();
    }
    String grade = "";
    if(score >= 90) {
      grade = "A";
      if(score > 95) {
        grade += "+";
      } else {
        grade += "0";
      }
    } else if (score>=80) {
      grade = "B";
      if(score > 85) {
        grade += "+";
      } else {
        grade += "0";
      }
    } else if (score>=70) {
      grade = "C";
    } else if (score>=60) {
      grade = "D";
    } else {
      grade = "F";
    }
    System.out.println(grade);
  }
}
