package chapter05;

public class VarArgsEx {
  public static void main(String[] args) {
    printSum(1,2,3,4,5,6);
  }
  static void printSum(int loop, int...nums) {
    int sum = 0;
    for(int num:nums){
      sum += num;
    }
    System.out.println(sum);
  }
}
