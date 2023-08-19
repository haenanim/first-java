package cote;

public class test10 {
  public static void main(String[] args) {
    String my_string = "Progra21Sremm3";
    int s = 6;
    int e = 2;
    String answer = "";
    int count = 0;
    for(int i = 0; i < my_string.length(); ++i) {
      if(i > e && s > i) {
        for(int j = 0; j < i - e; ++j) {
          answer += my_string.charAt(i+s-j);
        }
        i += s;
      }
      answer+= my_string.charAt(i);

    }
    System.out.println(answer);
  }
}
