package chapter06;

public class TypeConvertEx2 {
  public static void main(String[] args) {
    Student s = new Student();
    Person p = new Person();
    Worker w = new Worker();
    System.out.println("s instanceof Student:"+(s instanceof Student));
    System.out.println("s instanceof Person:"+(s instanceof Person));
    System.out.println("p instanceof Student:"+(p instanceof Student));
    downcast(p);
    downcast(s);
    downcast(w);
  }

  static void downcast(Person p) {
    if(p instanceof Student){
      Student s = (Student) p;
    } else if (p instanceof Worker) {
      Worker w = (Worker)p;
      w.work();
    }
  }
//  static void downcast(Student s) {
//
//  }
//  static void downcast(Worker w) {
//
//  }
}
