package lez7;

public enum MeseEnum {
  GEN(1), FEB(2), MAR(3); // ...

  private int mese;

  // implicitamente privato
  MeseEnum(int mese) { this.mese = mese; }
  public int toInt() { return mese; }
}
