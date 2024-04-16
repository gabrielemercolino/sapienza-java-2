package lez7;

import java.util.Arrays;

public class Lez7 {
  public static void main(String[] args){
    // variableArray();
    // variableArguments(1, 2, 3);
    // matrix();
    meseEnum();
  }

  static void variableArray(){
    int[] array = {1,2,3,4};
    System.out.println(Arrays.toString(array));
  
    array = Arrays.copyOf(array, 2);
    System.out.println(Arrays.toString(array));

    array = Arrays.copyOf(array, 7);
    System.out.println(Arrays.toString(array));
  }

  static void variableArguments(int... numbers){
    for (int i = 0; i < numbers.length -1; i++) {
      System.out.print(numbers[i] + ", ");
    }

    System.out.println(numbers[numbers.length - 1]);
  }

  static void matrix(){
    final int RIGHE = 10;
    final int COLONNE = 10;

    final int x = 5;
    final int y = 5;

    String[][] matrix = new String[RIGHE][COLONNE];
    
    System.out.println(matrix[y][x]);
    matrix[y][x] = "A";
    System.out.println(matrix[y][x]);
  }

  static void meseEnum(){
    MeseEnum mese = MeseEnum.FEB;

    switch (mese) {
      case GEN:
        System.out.println("Primo caso");
        break;
      // ...
      default:
        System.out.println("Default");
        break;
    }
  }

  static void classiWrapper(){
    Integer k = new Integer(3);

    // auto boxing
    Integer i = 3;

    // auto unboxing
    int j = i;
  }
}
