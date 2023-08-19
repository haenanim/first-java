package cote;

import java.util.Arrays;

public class test3 {
  public static void main(String[] args) {

    System.out.println(Solution.solution(2, 2, 2, 2));
    System.out.println(Solution.solution(1, 1, 1, 4));
    System.out.println(Solution.solution(4, 1, 4, 4));
    System.out.println(Solution.solution(6, 3, 3, 6));
    System.out.println(Solution.solution(2, 1, 2, 3));
    System.out.println(Solution.solution(6, 3, 2, 1));
    System.out.println(Solution.solution(1, 1, 5, 5));

  }

  static class Solution {
    public static int solution(int a, int b, int c, int d) {
      int[] dice = {a, b, c, d};
      for (int i = 0; i < dice.length; ++i) {
        for (int j = 0; j < dice.length - 1; ++j) {
          if (i == j) continue;
          if (dice[i] > dice[j]) {
            int temp = dice[i];
            dice[i] = dice[j];
            dice[j] = temp;
          }
        }
      }

      System.out.println(Arrays.toString(dice));

      if (dice[0] == dice[3]) {
        return dice[0] * 1111;
      } else if (dice[0] == dice[2]) {
        return (dice[0] * 10 + dice[3]) * (dice[0] * 10 + dice[3]);
      } else if (dice[1] == dice[3]) {
        return (dice[3] * 10 + dice[1]) * (dice[3] * 10 + dice[1]);
      } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
        if (dice[0] == a) {
          return (dice[0] + dice[2]) * (dice[0] - dice[2] < 0 ? (dice[0] - dice[2]) * -1 : dice[0] - dice[2]);
        } else {
          return (dice[2] + dice[0]) * (dice[2] - dice[0] < 0 ? (dice[2] - dice[0]) * -1 : dice[2] - dice[0]);
        }
      } else if (dice[0] == dice[1]) {
        return dice[2] * dice[3];
      } else if (dice[1] == dice[2]) {
        return dice[0] * dice[3];

      } else if (dice[2] == dice[3]) {
        return dice[0] * dice[1];

      } else {
        return dice[3];
      }
    }
  }
}
