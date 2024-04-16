package lez10.interfaces.disambiguazione;

public class C implements I1, I2{
  @Override
  public void metodo() {
    // Disambiguare i metodi di default delle due interfacce
    I1.super.metodo();
    I2.super.metodo();
  }
}
