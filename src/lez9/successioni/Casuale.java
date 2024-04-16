package lez9.successioni;

import java.util.Iterator;
import java.util.Random;

public class Casuale implements Iterable<Integer>{
  private final int max;

  public Casuale(int max){
    this.max = max;
  }

  @Override
  public Iterator<Integer> iterator(){
    return new Iterator<>() {
      private int i;
      private final Random random = new Random();
      @Override
      public boolean hasNext() {
        return i < max;
      }

      @Override
      public Integer next() {
        i++;
        return random.nextInt(0, 10);
      }
    };
  }
}
