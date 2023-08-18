package chapter06.ExtendsTest;

public class Account {
  final static int MIN_BALANCE = 0;
  final static int MAX_BALANCE = 1_000_000;
  private String accountNum="";
  private String accountName="";
  private int balance = 0;
  Account(String accountNum, String accountName, int balance) {
    this.accountNum = accountNum;
    this.accountName = accountName;
    this.balance = balance;
  }

  public String getAccountName() {
    return accountName;
  }

  String getAccountNum() {
    return this.accountNum;
  }
  int getBalance() {
    return this.balance;
  }
  void setBalance(int balance) {
    if(balance < MIN_BALANCE || balance > MAX_BALANCE){
      return;
    }
    this.balance += balance;
  }


  void withdraw(int balance) {
    if(balance > MIN_BALANCE) {
      this.balance -=balance;
    }
  }
  void deposit(int balance) {
    if(balance < MIN_BALANCE){
      if(this.balance - balance < 0) {
        System.out.println("잔고부족");
      }else {
        this.balance += balance;
      }
    }

  }
}
