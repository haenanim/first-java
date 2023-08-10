package classExample;

public class AnimalTest {
  public static void main(String[] args) {
    Object obj = new Object();
    Bird bird = new Bird();
    Tiger tiger = new Tiger();
    tiger.run();
    tiger.breath();
    bird.flying();
    bird.breath();
    Animal animal[] = new Animal[3];
    animal[0] = tiger;
    animal[1] = bird;
  }
}
