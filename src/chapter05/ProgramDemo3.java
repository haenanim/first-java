package chapter05;

public class ProgramDemo3 {
  public static void main(String[] args) {
    double[][] interests = {{3.2,3.1,3.2,3.0},{2.9,2.8,2.7,2.6},{2.7,2.6,2.5,2.7}};
    double[] sum1 = {0.0,0.0,0.0};
    double sum2 = 0.0;
    int count = 0;

    for(double[] a : interests) {
      double temp = 0.0;
      for(double b : a) {
        sum1[count] += b;
      }
      temp = sum1[count]/a.length;
      sum2+=temp;
      System.out.printf("%d차년도 평균 이자율 = %.2f\n", count+1, temp);
      ++count;
    }
    System.out.printf("%d년간 평균 이자율 %.2f\n", sum1.length, sum2/3);

  }
}
