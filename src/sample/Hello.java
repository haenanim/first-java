package sample;

/**
 * first java program
 * HelloWorld!!
 * number dot program
 */
public class Hello {
  public static void main(String[] args) {
    String an = BigNumber(2101231232);
    System.out.println(an);
  }
  public static String BigNumber(int number) {
    int i = number;
    String num = "";
    int dotCount = 0;
    while(i > 0) {
      if(dotCount == 3) {
        dotCount = 0;
        num = (",") + num;
      }
      num = String.valueOf(i%10) + num;
      i = i / 10;
      ++dotCount;
    }
    return num;
  }
}
