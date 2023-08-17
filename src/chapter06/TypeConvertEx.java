package chapter06;

public class TypeConvertEx {
  public static void main(String[] args) {
//    Person p = new Person();
//    Student s = new Student();
//
//    String name = s.name;
//    int num = s.number;
//    s.work();
//    s.whiAmi();
    Person p;
    Student s = new Student();
    Worker w = new Worker();
    p = s;
    s.work();
    p = w;
    p.whiAmi();

    Object o;
    o = s;
    o = w;
  }
}
