package chapter07;

class OnlyOnce {
  public static void main(String[] args) {
    Parent p = new Parent() {
      void parent() {
        System.out.println("over");
      }
    };
    p.parent();
  }

}

class Parent{
  void parent() {
    System.out.println("parent");
  }
}