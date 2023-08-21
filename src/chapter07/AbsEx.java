package chapter07;

public class AbsEx {
  public static void main(String[] args) {
    Bb aabb = new Bb(100);
    aabb.show();
  }
}

abstract class Aa {
  int i;
  Aa(int i ){
    this.i = i;
  }
  abstract void show();
}

class Bb extends Aa {
  Bb(int i) {
    super(i);
  }

  @Override
  public void show() {
    System.out.println(this.i);
  }
}
