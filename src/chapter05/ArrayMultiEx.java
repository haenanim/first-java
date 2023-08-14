package chapter05;

public class ArrayMultiEx {
  public static void main(String[] args) {
    int[][] scores = new int[][] {{90,100,80,70,80},{60,60,70,80,90,},{90,100,80,70,80}};
    int[] sums = new int[3];
    for(int[] a: scores) {
      int sum = 0;
      for(int b: a) {
        sum += b;
      }
      System.out.println("합산점수 :"+sum);
      System.out.println("평균점수 :"+(double)sum/a.length);
    }
  }
}
