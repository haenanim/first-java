package chapter05;

public class ArrayEx1 {
  public static void main(String[] args) {
    int[] scores = {90,95,100};
    for(int score: scores){
      System.out.println(score);
    }
    int[] bigScores = new int[5];
    for(int i = 0; i < scores.length; ++i) {
      bigScores[i] = scores[i];
    }
    for(int a : bigScores) {
      System.out.println(a);
    }
  }
}
