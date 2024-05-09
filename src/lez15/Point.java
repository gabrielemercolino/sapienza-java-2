package lez15;

public class Point<T extends Number> extends Coppia<T, T> {
  public Point(T a, T b) {
    super(a, b);
  }

  public T x() {
    return super.getFirst();
  }

  public T y() {
    return super.getSecond();
  }
}
