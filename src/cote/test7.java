package cote;

public class test7 {
  public static void main(String[] args) {
    String[] my_string = {"progressive", "hamburger", "hammer", "ahocorasick"};
    //prog am mer s
    int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
    String answer = "";
    for(int i = 0; i < my_string.length; ++i) {
      answer += my_string[i].substring(parts[i][0],parts[i][1]+1);
    }
    System.out.println(answer);
  }
}
