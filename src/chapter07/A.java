package chapter07;

public interface A {
  void method();
  void method2();
  default void defaultMethod() {
    System.out.println("default");
  }
}
class C1 implements A {

  @Override
  public void method() {
    System.out.println("method");
  }

  @Override
  public void method2() {


  }
}

class C2 implements A {

  @Override
  public void method() {
    System.out.println("method2");
  }

  @Override
  public void method2() {

  }
}

class C3 implements A {

  @Override
  public void method() {

  }

  @Override
  public void method2() {

  }
}