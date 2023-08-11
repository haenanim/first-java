package classExample2;

public class PersonTest {
  public static void main(String[] args) {
    Person minkok = new Person();
    Person son = new Person();
    minkok.setName("민국");
    minkok.setAge(20);
    minkok.sayHello();
    son.setName("쏜").setAge(30).sayHello();
  }
}
