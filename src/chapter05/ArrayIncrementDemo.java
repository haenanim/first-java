package chapter05;

import java.util.Arrays;

public class ArrayIncrementDemo {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(args));
    int[] arr = {2,3,4,5,6};
    increment(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void increment(int[] arr) {
    arr[0] = 1;
  }
}
