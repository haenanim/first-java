package chapter07;

public class LineCompareTest {
  public static void main(String[] args) {
    Line l1 = new Line(10);
    Line l2 = new Line(20);

    System.out.println(l1.compareTo(l2));
  }
}

class Line implements Comparable{
  int length;

  public Line(int length) {
    this.length = length;
  }
//  Line compareTo(Line line) {
//    return (line.length > this.length ? line : this);
//  }

  @Override
  public String toString() {
    return "길이 " + this.length + " 짜리 Line";
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Line) {
      Line line = (Line)o;
      return line.length - this.length;
    }
    return 0;
  }
}
