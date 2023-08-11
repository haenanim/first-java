package classExample2;

public class Person {
  private String name;
  private int age;


  public String getName() {
    return name;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Person setAge(int age) {
    this.age = age;
    return this;
  }
  public void sayHello() {
    System.out.println("안녕 나는" + this.name + "이야 나이는" + age + "살이야");
  }
}
