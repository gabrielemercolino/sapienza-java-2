package lez6;

public class Lez6 {
  public static void main(String[] args) {
     // stampaVerticale("ciao");
     arrays();
  }

  static void stampaVerticale(String text){
    for (int i = 0; i < text.length(); i++) {
      System.out.println(text.charAt(i));
    }
  }

  static void arrays(){
    System.out.println("int[] array = new int[10];");
    int[] a = new int[10];
    stampaArray(a);

    System.out.println();

    System.out.println("int[] array = new int[] {1,2,3,4};");
    a = new int[] {1,2,3,4};
    stampaArray(a);
  }

  private static void stampaArray(int[] array){
    for (int i = 0; i < array.length; i++) {
      System.out.println("array["+ i + "]=" + array[i]);
    }
  }

  private static void stampaArray(Object[] array){
    for (int i = 0; i < array.length; i++) {
      System.out.println("array["+ i + "]=" + array[i]);
    }
  }
}
