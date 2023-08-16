package cote;

import java.util.Arrays;

public class test1 {
  public static void main(String[] args) {
    int l = 10;
    int r = 20;
    int[] answer = {};
    int count = 0;
    for(int i = l; i <= r; ++i) {
      String a = ""+i;
      a = a.replace("5","");
      a = a.replace("0","");
      if(a.equals("")){
        int[] temp =new int[count+1];
        for(int j = 0; j < answer.length; ++j) {
          temp[j] = answer[j];
        }
        temp[count] = i;
        answer = temp.clone();
        ++count;
      }
    }
    System.out.println(Arrays.toString(answer));
  }
}
