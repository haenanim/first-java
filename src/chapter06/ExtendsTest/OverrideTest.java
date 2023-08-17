package chapter06.ExtendsTest;

public class OverrideTest {
  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[2];
    vehicles[0] = new Vehicle("파랑", 150);
    vehicles[1] = new Car("초록", 200, 10000, 5);
    for(Vehicle it: vehicles) {
      it.show();
    }


    Phone[] phones = new Phone[3];
    phones[0] = new Phone("사장님");
    phones[1] = new Telephone("사장님","부장님");
    phones[2] = new Smartphone("사장님", "디아블로");
    for(Phone pon : phones) {
      if(pon instanceof Smartphone) {
        ((Smartphone) pon).playGame();
      } else if (pon instanceof Telephone) {
        ((Telephone) pon).autoAnswering();
      } else if (pon instanceof Phone) {
        pon.talk();
      }
    }
  }

}
