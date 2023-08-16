package chapter05;

public class ArgsEx {
  public static void main(String[] args) {
    if(args.length < 2) {
      return;
    }
    if(Integer.parseInt(args[1]) > 0) {
      loopSay(args[0], Integer.parseInt(args[1]));
    }

  }
  static void loopSay(String str, int l) {
    for(int i = 0; i < l; ++i) {
      System.out.println(str);
    }
  }
}
