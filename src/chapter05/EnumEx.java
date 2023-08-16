package chapter05;

public class EnumEx {
  public static void main(String[] args) {
    People p1 = new People();
    People p2 = new People();
    p1.gender=Gender.MALE;
    p1.direction= Direction.EAST;
    p2.gender=Gender.FEMALE;
    p2.direction= Direction.WEST;
    System.out.println(p1.gender.getGender());
    System.out.println(p1.gender.name());
    System.out.println(p1.gender.ordinal());

    System.out.println(p2.gender.getGender());
    System.out.println(p2.gender.name());
    System.out.println(p2.gender.ordinal());
  }
}
class People {
  Gender gender;
  Direction direction;
}
class People1 {
  static final int MALE = 0;
  static final int FEMALE = 1;
  static final int EAST = 0;
  static final int WEST = 1;
  static final int SOUTH = 3;
  static final int NORTH = 4;
}
