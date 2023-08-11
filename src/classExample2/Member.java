package classExample2;
//이름, 나이, 아이디, 암호
public class Member {
  private String name;
  private int age;
  private String id;
  private String password;

  public Member(String name, int age, String id, String password) {
    this.name = name;
    this.age = age;
    this.id = id;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if(age > 0 && age < 120) {

      this.age = age;
    }else {
      System.out.println("asd");
    }
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

}
