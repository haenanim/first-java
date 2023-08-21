package chapter07;

public class CoinDemo {
  public static void main(String[] args) {
    System.out.println(Coin.PENNY);
  }
}

interface Coin {
  int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
}
