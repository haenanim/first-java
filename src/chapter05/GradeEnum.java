package chapter05;

public enum GradeEnum {
  A("Excellent"), B("Good"), C("Bad");
  private String grade;
  private GradeEnum() {}
  private GradeEnum(String grade) {
    this.grade = grade;
  }
  public String getGrade() {
    return grade;
  }
}
