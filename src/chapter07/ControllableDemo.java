package chapter07;

public class ControllableDemo {
  public static void main(String[] args) {
//    TV tv1 = new TV();
//    tv1.RemoteOn();
//    tv1.RemoteOff();
//    TV tv2 = new TV();
//    tv2.turnOn();
//    tv2.turnOff();
//    Computer computer = new Computer();
//    computer.turnOn();
//    computer.turnOff();
//    Notebook notebook = new Notebook();
//    notebook.turnOn();
//    notebook.turnOff();
//    notebook.inMyBag();
    Controllable[] controllables = {
        new TV(),
        new Computer(),
        new Notebook()
    };
    for(Controllable controllable: controllables){
      controllable.turnOn();
      controllable.turnOff();
      controllable.repair();
      Controllable.reset();
    }
  }
}
