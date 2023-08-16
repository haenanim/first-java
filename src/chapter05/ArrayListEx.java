package chapter05;

import java.util.ArrayList;

public class ArrayListEx {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<AA> aaList = new ArrayList<>();
    AA a1 = new AA(1);
    BB b1 = new BB(2);
    aaList.add(a1);
    aaList.add(b1);
    arrayList.add(1);
    arrayList.add(2);
    System.out.println(arrayList);
  }
}
class AA {
  int size;
  AA(int size) {
    this.size = size ;
  }
  void say() {
    System.out.println(size);
  }
}
class BB extends AA {
  String say;

  BB(int size) {
    super(size);
  }

  @Override
  void say() {
    System.out.println(say);
  }

}
