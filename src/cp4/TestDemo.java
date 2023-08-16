package cp4;

import java.util.Scanner;

public class TestDemo {
  public static void main(String[] args) {
    int sum = 0;
    for(int i = 0; i < 100; i +=3) {
      sum += i;
      System.out.println(i);
    }

    System.out.println(sum);

    while(true){
      double a = Math.random()*6+1;
      double b = Math.random()*6+1;
      System.out.println((int)a + "+" + (int)b + "=" + ((int)a + (int)b));
      if(((int)a + (int)b) == 5) {
        break;
      }
    }
      for(int i = 0; i <= 10; ++i) {
        for(int j = 0; j <= 10; ++j) {
          if(((i*4) + (j*5)) == 60) {
            System.out.printf("(%d, %d)", i,j);
          }
        }
      }


      for(int i = 0 ; i < 10; ++i) {
        for(int j = 0; j < i; ++ j) {
          System.out.print("*");
        }
        System.out.println();
      }

    Scanner in = new Scanner(System.in);
      int money = 0;
      boolean loop = true;

      while(loop) {
        System.out.println("----------------------------");
        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
        System.out.println("----------------------------");
        String input = in.nextLine();
        switch(input){
          case "4"->{ loop = false; }
          case "3"->{
            System.out.println(money );
          }
          case "2"->{
            System.out.print("출금액>");
            money -= in.nextInt();
          }
          case "1"->{
            System.out.print("예금액>");
            money += in.nextInt();
          }
        }
      }
  }
}
