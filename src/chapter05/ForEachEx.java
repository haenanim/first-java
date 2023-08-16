package chapter05;

public class ForEachEx {
  public static void main(String[] args) {
    int[] one2five = {1,2,3,4,5};
    for(int i =0; i < one2five.length; ++i){
      one2five[i]++;
    }
    for(int idx: one2five) {
      System.out.println(idx);
    }
  }
}
