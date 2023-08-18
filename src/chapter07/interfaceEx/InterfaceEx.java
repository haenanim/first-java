package chapter07.interfaceEx;

public interface InterfaceEx {
  void method();
}

class A implements InterfaceEx {
  @Override
  public void method() {
    System.out.println("A의 메소드");
  }
}

class B implements InterfaceEx {
  @Override
  public void method() {
    System.out.println("B의 메소드");

  }
}

class C extends A {
  @Override
  public void method() {
    System.out.println("C의 메소드");

  }
}
class D extends B {
  @Override
  public void method() {
    System.out.println("D의 메소드");

  }
}