package day2;

public class MethodOverroading {
  public static void main(String[] args) {
    int res = sum(1, 2);
    long res1 = sum(1L, 2L);
    System.out.println(MethodEx2.add(1,1));
  }
  static int sum(int i, int j) {
    System.out.println("이건 인트형입니다.");
    return i + j;
  }
  static long sum(long i, long j) {
    System.out.println("이건 롱형입니다.");
    return i + j;
  }
}
