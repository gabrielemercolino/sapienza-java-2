package lez8.stringhe;

import java.util.Random;

public class StringaHackerata {
  protected String s;

  public  StringaHackerata(String s){
    this.s = s;
  }

  @Override
  public String toString() {
    StringBuffer buffer = new StringBuffer();
    Random random = new Random();

    for (char c : s.toCharArray()){
      if (random.nextBoolean()) c = Character.toUpperCase(c);
      else c = Character.toLowerCase(c);

      buffer.append(c);
    }

    return buffer.toString();
  }
}
