package chapter06.ExtendsTest;

public class PrinterTest {
  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.println(34);
    printer.println(12.3453);
    printer.println(1==1);
    printer.println("asdf");
    Printer.println(4534);
  }
}
