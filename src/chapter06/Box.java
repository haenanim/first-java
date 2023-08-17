package chapter06;

public class Box {
  String name;
  public Box(){}
  public Box(String name) {

  }
}



class ColoredBox extends Box {
  public ColoredBox() {
    super();
  }

  public ColoredBox(String name) {
    super(name);
  }
}