package cote;

public class test3 {
  public static void main(String[] args) {

    System.out.println(Solution.solution(2,2,2,2));
    System.out.println(Solution.solution(4,1,4,4));
    System.out.println(Solution.solution(6,3,3,6));

  }
  static class Solution {
    public static int solution(int a, int b, int c, int d) {
      int[] dice = new int[7];
      dice[a]++;
      dice[b]++;
      dice[c]++;
      dice[d]++;
      for(int i = 0; i < dice.length; ++i) {
        if(dice[i] == 4) {
          return i*1111;
        } else if(dice[i] == 3){
          for(int j = 0; j < dice.length; ++j) {
            if(dice[j] == 1) {
              return 10*i+j;
            }
          }
        } else if (dice[i] == 2) {
          for(int j = i; j < dice.length; ++j) {
            int ather = 0;
            if(dice[j] == 2) {
              return (i+j)* ((i-j)>0?(i-j):0);
            } else if(dice[j]==1) {
              for(int k = 0; k < dice.length; ++k){
                if(dice[k] == 1) {
                  return j*k;
                }
              }
            }
          }

        }
      }
      int lower = 10;
      for(int j = 0; j < dice.length; ++j) {
        if(dice[j] == 1 && lower > j){
          lower = j;
        }
      }
      return lower;
    }
  }

}
