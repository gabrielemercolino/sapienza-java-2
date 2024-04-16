package lez10;

@FunctionalInterface
public interface Formula {
  double calculate(double a);
  default double sqrt(double a) {return Math.sqrt(a);}
}
