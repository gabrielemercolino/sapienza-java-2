package lez12;

public class NomeCognome implements Comparable<NomeCognome>{
  private String nome, cognome;

  public NomeCognome(String nome, String cognome){
    this.nome = nome;
    this.cognome = cognome;
  }

  public String getNome() {
    return nome;
  }

  public String getCognome() {
    return cognome;
  }

  @Override
  public String toString() {
    return STR."nome: \{nome}, cognome: \{cognome}";
  }

  @Override
  public int compareTo(NomeCognome o) {
    int x = nome.compareTo(o.nome);
    if (x == 0) x = cognome.compareTo(o.cognome);

    return x;
  }
}
