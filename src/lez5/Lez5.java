package lez5;

import java.util.Scanner;

public class Lez5 {
  public static void main(String[] args){
    // tornello();
    // inputConsole();
    // tiraMoneta();
    // tiraMonetaInline();
    for (int i = 0; i < 5; i++) hello();
  }

  static void inputConsole(){
    Scanner input = new Scanner(System.in);
    System.out.print("Come ti chiami? ");
    String nome = input.nextLine();
    System.out.println("Ciao " + nome + "!");
  }

  static void tornello(){
    Tornello t1 = new Tornello();
    t1.passa();
    Tornello t2 = new Tornello();
    for (int k = 0; k < 10; k++) t2.passa();
    int g;
    String s = null;
    // fotografia memoria
    System.out.println(Tornello.getPassaggi());
  }

  static void tiraMoneta(){
    if (Math.random() < 0.5) System.out.println("Testa");
    else                     System.out.println("Croce");
  }

  static void tiraMonetaInline(){
    System.out.println((Math.random() < 0.5) ? "Testa" : "Croce");
  }

  static void hello(){
    System.out.println(new SalutoCasuale());
  }
}
