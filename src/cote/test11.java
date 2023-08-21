package cote;

import java.util.Arrays;

public class test11 {
  public static void main(String[] args) {
    String my_string = "AAAaaaBBbbCc";
    int[] answer = new int[52];
    for(int i = 0; i < my_string.length();++i){
      if(my_string.charAt(i) < 91) {
        answer[((int)my_string.charAt(i) - 65)]++;
      }else{
        answer[((int)my_string.charAt(i) - 97+26)]++;
      }
    }
    System.out.println(Arrays.toString(answer));
  }
}
