package lez7.forma;

public class Triangolo extends Forma {
  private double base, height;

  public Triangolo(final double base, final double height) {
    this.base = base;
    this.height = height;
  }

  @Override
  public void disegna(){
    // ...
  }

  public double getBase()   { return base; }
  public double getHeight() { return height; }
}
