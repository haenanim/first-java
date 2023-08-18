package chapter06.ExtendsTest;

import java.util.Scanner;

public class BankApplication {
  Account[] accounts = new Account[100];
  public boolean commend() {
    System.out.println("""
        ----------------------------------------------
        1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
        ----------------------------------------------
        """);

    Scanner in = new Scanner(System.in);
    Account selectAcc = null;
    String commend = in.nextLine();
    if(commend.equals("1")){
      addAccount();
    }else if (commend.equals("2")) {
      for(Account acc : accounts) {
        if(acc == null) {
          break;
        }
        System.out.println(acc.getAccountNum()+"  "+acc.getAccountName()+"   "+acc.getBalance());
      }
    }else if (commend.equals(("3"))) {
      System.out.println("계좌번호 :");
      String findAcc = in.nextLine();
      selectAcc = selectAccount(findAcc);

      System.out.println("예금액 :");
      selectAcc.deposit(in.nextInt());
    }else if (commend.equals(("4"))) {
      System.out.println("계좌번호 :");
      String findAcc = in.nextLine();
      selectAcc = selectAccount(findAcc);

      System.out.println("출금액 :");
      selectAcc.withdraw(in.nextInt());

    }else if (commend.equals("5")) {
      return false;
    }
    return true;
  }

  void addAccount() {
    Scanner input = new Scanner(System.in);

    System.out.print("계좌번호 EX)111-1111 : \n");
    String accNum = input.nextLine();

    System.out.print("계좌주 : \n");
    String accName = input.nextLine();

    System.out.print("초기입금액 : \n");
    int balance = input.nextInt();

    for(int i = 0; i < accounts.length; ++i) {
      if(accounts[i] == null) {
        accounts[i] = new Account(accNum, accName, balance);
      }
    }
    System.out.println("계좌가 생성되었습니다.");
  }

  Account selectAccount(String accNum) {
    for(Account acc: accounts) {
      if(acc.getAccountNum().equals(accNum)) {
        return acc;
      }
    }
    return null;
  }


}
