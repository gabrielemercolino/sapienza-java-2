package lez15;

public class MyClass <T extends Comparable<T>> implements MinMax<T>{
  T val1, val2;
  public MyClass(T val1, T val2){
    this.val1 = val1;
    this.val2 = val2;
  }
  @Override
  public T min() {
    int t = val1.compareTo(val2);
    if (t<=0) return val1;
    return val2;
  }

  @Override
  public T max() {
    int t = val1.compareTo(val2);
    if (t>=0) return val1;
    return val2;
  }
}
