package chapter07;

public class MultiInterface {
}

interface Multi extends Edible, Sweetable {
}
interface Edible {
  void eat();
}
interface Sweetable {
  void sweet();
}
