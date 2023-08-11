package classExample2.circleTest;

public class Dice {
  private double chance;
  private double randomNum;
  public int rollDice(int num) {

//    chance = 1.0/(double)num*1000.0;
//    chance = Math.round(chance)/1000.0;
//    randomNum = Math.random()*1000.0;
//    randomNum = Math.round(randomNum)/1000.0;
//    return (int)(randomNum / chance + 1);
    return (int)(Math.random()*num)+1;
  }



}
