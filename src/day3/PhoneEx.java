package day3;

public class PhoneEx {
  public static void main(String[] args) {
//    Phone phone1 = new Phone();
//    phone1.model = "갤럭시23";
//    phone1.value = 100;
//    phone1.print();
//
//    Phone phone2 = new Phone();
//    phone1.model = "아이폰프로";
//    phone1.value = 200;
//    phone1.print();
//
//    Phone phone3 = new Phone();
//    phone3.print();
    Phone phone4 = new Phone("샤오미", 90);
    phone4.print();
    System.out.println(Phone.getNumOfPhones());

    Phone phone5 = new Phone("샤오미", 110);
    phone5.print();
    System.out.println(Phone.getNumOfPhones());
  }
}
