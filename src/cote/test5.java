package cote;

public class test5 {
  public static void main(String[] args) {
    String my_string = "rermgorpsam";
    int[][] queries = {{2,3},{0,7},{5,9},{6,10}};
    String answer = "";

    for(int i = 0 ; i < queries.length; ++i) {
      int count = 0;
      answer = "";
      for(int j = 0; j < my_string.length(); ++j) {
        if(queries[i][0] <= j && queries[i][1] >= j){
          answer +=my_string.charAt(queries[i][1]-count);
          count++;
        }else{
          answer += my_string.charAt(j);
        }
      }
      my_string = answer;
    }



    System.out.println(answer);
  }
}
