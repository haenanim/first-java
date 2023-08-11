package classExample2.circleTest;

public class DiceTest {
  public static void main(String[] args) {
    Dice dice = new Dice();
    int count[] = new int[6];
    for (int i = 0; i < 20000; ++i){
      count[dice.rollDice(6)-1]++;
    }

    for(int i = 0; i < 6; ++i) {
      System.out.println(i+1 + " : " + count[i]);
    }
  }
}
