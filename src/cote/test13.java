package cote;

public class test13 {
  public static void main(String[] args) {
    int[] indeces = {1, 16, 6, 15, 0, 10, 11, 3};
    String my_string = "apporoograpemmemprs";
    String answer = "";
    for(int i = 0; i < my_string.length(); i++) {
      if(isContain(indeces,i)) {
        continue;
      }
      answer+=my_string.charAt(i);
    }
    System.out.println(answer);
  }
  static boolean isContain(int[] arr, int idx) {
    for(int i = 0; i < arr.length; ++i) {
      if(arr[i] == idx){
        return true;
      }
    }
    return false;
  }
}
