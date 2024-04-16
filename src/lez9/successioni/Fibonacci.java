package lez9.successioni;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {
  private final int max;

  public Fibonacci(int max) {
    this.max = max;
  }

  @Override
  public Iterator<Integer> iterator() {
    return new Iterator<>() {
      private int a = 0, b = 1;

      @Override
      public boolean hasNext() {
        return (a + b) <= max;
      }

      @Override
      public Integer next() {
        int temp = b;
        b = a + b;
        a = temp;
        return b;
      }
    };
  }
}
