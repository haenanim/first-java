package cote;

public class test10 {
  public static void main(String[] args) {
    String my_string = "Progra21Sremm3";
    int s = 6;
    int e = 12;
    String answer = "";
    answer += my_string.substring(0, s);
    for(int i = e-s; i >= 0; --i) {
      answer += my_string.charAt(s+i);
    }
    answer += my_string.substring(e+1);
//    int count = 0;
//    for(int i = 0; i < my_string.length(); ++i) {
//      if(i > e && s > i) {
//        for(int j = 0; j < i - e; ++j) {
//          answer += my_string.charAt(i+s-j);
//        }
//        i += s;
//      }
//      answer+= my_string.charAt(i);
//
//    }
    System.out.println(answer);
  }
}
