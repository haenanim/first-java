package chapter05;

import java.util.Scanner;

public class EnumScoreTest {
  public static void main(String[] args) {
    int numOfStudents = 0;
    GradeEnum grade = null;
    Scanner in = new Scanner(System.in);
    numOfStudents = in.nextInt();
    int[] scores = new int[numOfStudents];
    for(int i = 0; i < numOfStudents; ++i){
       scores[i] = in.nextInt();
    }


    for (int i: scores) {

      if(i >= 90) {
        grade=GradeEnum.A;
      }
      else if (i >= 80) {
        grade = GradeEnum.B;
      }
      else if (i >= 70) {
        grade=GradeEnum.C;
      }
      System.out.println(grade.getGrade());
    }
  }
}
