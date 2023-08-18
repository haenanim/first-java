package chapter07.interfaceEx;

public class InterfaceTest {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();
    InterfaceEx[] ia = new InterfaceEx[4];
    ia[0] = a;
    ia[1] = b;
    ia[2] = c;
    ia[3] = d;

    for(int i = 0; i < ia.length; ++i) {
      ia[i].method();
    }
  }
}
