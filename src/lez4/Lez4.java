package lez4;

public class Lez4{
  public static void main(String[] args){
    String s = "Ciao";
    // String s = new String("Ciao");
    
    System.out.println(s.length());
    
    System.out.println(s.toLowerCase());
    System.out.println(s.toUpperCase());
    System.out.println(s);
    
    System.out.println(s.charAt(2));

    System.out.println(s.substring(1, 3));
    System.out.println(s.substring(1));

    String s2 = s + "!";
    String s3 = s.concat("!");

    System.out.println(s2);
    System.out.println(s3);

    // StringBuilder sb = new StringBuilder();
    // sb.append(s).append("!");
    // System.out.println(sb);

    int x = s.indexOf("a");
    System.out.println(x);
    System.out.println(s.indexOf("!"));
    System.out.println(s.indexOf('!'));

    System.out.println("uno_due_tre".replace('_', ' '));

    String ciao1 = "ciao";
    String ciao2 = "ci"+"ao";
    String ciao3 = ciao1.substring(0);

    System.out.println(ciao1 == ciao2); // forse
    System.out.println(ciao1 == ciao3); // forse
    System.out.println(ciao1.equals(ciao2));  // funziona correttamente sempre
    
    String[] parole = "uno due tre".split(" ");
    // { "uno", "due", "tre" } 
  }
}
