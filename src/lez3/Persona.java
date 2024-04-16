package lez3;

public class Persona {
  private final String nome;
  private final String cognome;
  
  public Persona(String nome, String cognome){
    this.nome = nome;
    this.cognome = cognome;
  }

  public String getNome(){ return nome; }
  public String getCognome() { return cognome; }

  @Override
  public String toString(){
    return "Nome: " + nome + ", Cognome: " + cognome;
  }
}
