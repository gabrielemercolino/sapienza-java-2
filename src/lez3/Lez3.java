package lez3;

public class Lez3 {
  public static void main(String[] args) {
    // counterExample();
    personExample();
  }

  public static void counterExample() {
    Counter counter = new Counter(1);

    counter.increment();
    System.out.println(counter.getCount());

    counter.reset(69);
    System.out.println(counter.getCount());

    counter.reset();
    System.out.println(counter.getCount());
    
  }

  public static void personExample(){
    Persona p = new Persona("IntVector", "Sus");
    System.out.println(p);
  }
}
