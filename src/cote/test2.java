package cote;

public class test2 {
  public static void main(String[] args) {
    int[] arr = {1,4,2,5,3};
    int[] stk = {};
    for(int i = 0; i < arr.length; ++i){
      if(i < arr.length) {
        if(stk.length == 0) {
          stk = pushBack(stk,arr[i]);
        } else if(0 < arr.length && stk[stk.length-1] < arr[i]) {
          stk = pushBack(stk,arr[i]);
        } else if(0 < arr.length && stk[stk.length-1] > arr[i]) {
          stk = popBack(stk);
          --i;
        }
      }
    }

  }
  static int[] pushBack(int[] arr, int num) {
    int[] newArr = new int[arr.length + 1];
    for(int i = 0; i < arr.length; ++i) {
      newArr[i] = arr[i];
    }
    newArr[newArr.length-1] = num;
    return newArr;
  }
  static int[] popBack(int[] arr) {
    int[] newArr = new int[arr.length-1];
    for(int i = 0; i < arr.length-1; ++i) {
      newArr[i] = arr[i];
    }
    return newArr;
  }
}
