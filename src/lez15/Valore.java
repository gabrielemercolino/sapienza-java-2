package lez15;

public class Valore<T> {
  private T val;

  public Valore(T val){
    this.val = val;
  }

  public T get() {
    return val;
  }
  public void set(T val){
    this.val = val;
  }

  public String getType(){
    return val.getClass().getTypeName();
  }
}
