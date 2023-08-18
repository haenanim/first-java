package cote;

public class test6 {
  public static void main(String[] args) {
    String[] intStrs = {"0123456789","9876543210","9999999999999"};
    int[] answer = {};
    int k = 50_000;
    int s = 5;
    int l = 5;
    for(int i = 0; i < intStrs.length; ++i) {
      String number = "";
      for(int j = s; j < s+l; ++j){
        number+=intStrs[i].charAt(j);
      }
      if(Integer.parseInt(number) > k){
        answer = pushBack(answer,Integer.parseInt(number));
      }
    }
  }
  static int[] pushBack(int[] arr, int number) {
    int[] newArr = new int[arr.length+1];
    for(int i = 0; i < arr.length; ++i){
      newArr[i] = arr[i];
    }
    newArr[newArr.length-1] = number;
    return newArr;
  }
}
