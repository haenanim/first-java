package day2;

public class MethodEx1 {
  public static void main(String[] args) {
    sum(1, 10);
    sum(10, 100);
    int a = returnSum(1, 10);
    System.out.printf("1 ~ 10 까지의 합 %d\n", a);
  }
  static void sum(int first, int last) {
    int sum = 0;
    for(int i = first; i <= last; i++) {
      sum += i;
    }
    System.out.printf("%d ~ %d 까지의 합 %d\n",first,last, sum);
  }
  static int returnSum(int first, int last) {
    int sum = 0;
    for(int i = first; i <= last; i++) {
      sum += i;
    }
    return sum;
  }
}
