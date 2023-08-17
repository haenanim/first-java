package chapter06.ExtendsTest;

public class Phone {
  protected String owner;
  public Phone(String owner) {
    this.owner = owner;
  }
  public void talk() {
    System.out.printf("%s가 통화중\n", owner);
  }
}
class Telephone extends Phone{
  private String when;
  public Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }
  public void autoAnswering() {
    System.out.printf("%s가 부재중이니 %s에게 전화요망\n", owner, when);
  }
}
class Smartphone extends Phone{
  private String game;
  public Smartphone(String owner, String game) {
    super(owner);
    this.game = game;
  }
  public void playGame() {
    System.out.printf("%s가 %s 게임중\n", owner, game);
  }

}