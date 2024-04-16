package lez10;

public class Tastiera {
  private final String tipo;
  public Tasto[] tasti;

  public class Tasto{
    private final char c;

    public Tasto(char c){
      this.c = c;
    }

    public char premi(){
      return c;
    }

    @Override
    public String toString() {
      return Character.toString(c);
    }
  }

  public Tastiera(String tipo, char[] caratteri){
    this.tipo = tipo;
    tasti = new Tasto[caratteri.length];

    for (int i = 0; i < tasti.length; i++) tasti[i] = new Tasto(caratteri[i]);
  }

  @Override
  public String toString() {
    StringBuilder buffer = new StringBuilder();

    buffer.append(tipo).append('\n');
    for (Tasto t : tasti)
      buffer.append(t);

    return buffer.toString();
  }
}
