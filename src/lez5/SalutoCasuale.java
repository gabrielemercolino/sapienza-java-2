package lez5;

import java.util.Random;

public class SalutoCasuale {
  @Override
  public String toString(){
    String hello = switch(new Random().nextInt(6)){
      case 0  -> hello = "ciao";
      case 1  -> hello = "hello";
      case 2  -> hello = "bella";
      case 3  -> hello = "salve";
      default -> hello = "buongiorno";
    };

    return hello;
  }
}
