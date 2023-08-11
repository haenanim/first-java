package day3;

public class Course {
  private String id = "";
  private String name = "";
  private int numOfStudents = 0;

  public void addStudent(int student) {
    this.numOfStudents+=student;
  }
  public void deleteStudent(int student) {
    this.numOfStudents-=student;
  }
  public void setID(String id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }
}
