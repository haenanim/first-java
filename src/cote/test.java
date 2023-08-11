package cote;

public class test {
  public static void main(String[] args) {
    String code = "abc1abc1abc";
    boolean mode = false;
    String answer = "";
    for(int i = 0; i < code.length();++i) {
      if(!mode) {
        if('1' == code.charAt(i)) {
          mode = true;
          continue;
        }
        if(i % 2 == 0){
          answer += code.charAt(i);
        }
      } else {
        if('1' == code.charAt(i)) {
          mode = false;
          continue;
        }
        if(i % 2 == 1){
          answer += code.charAt(i);
        }
      }
    }
    System.out.println(answer);
  }
}
