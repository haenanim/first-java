package classExample;

public class AnimalTest {
  public static void main(String[] args) {
    Object obj = new Object();
    Bird bird = new Bird();
    Tiger tiger = new Tiger();
    Fish fish = new Fish();
    Animal animal[] = new Animal[3];
    animal[0] = tiger;
    animal[1] = bird;
    animal[2] = fish;

    for(int i = 0; i < animal.length; ++i) {
      animal[i].move();
    }
  }
}
