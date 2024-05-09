package lez15;

public class Coppia<T,R> {
  private T a;
  private R b;

  public Coppia(T a, R b){
    this.a = a;
    this.b = b;
  }

  public T getFirst() {
    return a;
  }

  public R getSecond() {
    return b;
  }

  public void setFirst(T a) {
    this.a = a;
  }

  public void setSecond(R b) {
    this.b = b;
  }
}
