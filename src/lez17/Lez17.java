import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

final static String separator = "---------------------------------------";

void main(){
  ricorsione1();
  ricorsione2();
  ricorsioneMutuale();

  scanner();
  file();
}

private static void ricorsione1(){
  System.out.println(
          STR."""
          5!=\{fattorialeRicorsivo(5)}
          \{separator}"""
  );
}

private static int fattorialeRicorsivo(final int n) throws IllegalArgumentException{
  if (n < 0) throw new IllegalArgumentException("Input cannot be <0");
  if (n == 0) return 1;
  return n * fattorialeRicorsivo(n-1);
}

private static void ricorsione2(){
  //noinspection TrailingWhitespacesInTextBlock
  System.out.println(
          STR."""
                  ABCDEDCBA is palindrome? \{isPalindrome("ABCDEDCBA")}
                  ABCDDCBA  is palindrome? \{isPalindrome("ABCDDCBA")}
                  ABCEDCBA  is palindrome? \{isPalindrome("ABCEDCBA")}
                  \{separator}"""
  );
}
private static boolean isPalindrome(final String word){
  return isPalindrome(word, 0, word.length() - 1);
}
private static boolean isPalindrome(final String word, final int a, final int b){
  if (a>=b) return true;
  return word.charAt(a) == word.charAt(b) && isPalindrome(word, a+1, b-1);
}

private static void ricorsioneMutuale(){
  System.out.println(
          STR."""
                  \{isDispari(List.of(1, 2, 3, 4, 5))}
                  \{separator}"""
  );
}

private static boolean isDispari(List<Integer> l){
  return isDispari(l, 0);
}

private static boolean isDispari(List<Integer> l, final int i){
  if (i == l.size()) return true;
  return l.get(i) % 2 == 1 && isPari(l, i+1);
}

private static boolean isPari(List<Integer> l, final  int i){
  if (i == l.size()) return true;
  return l.get(i) % 2 == 0 && isDispari(l, i+1);
}

private static void scanner(){
  try (Scanner s = new Scanner(System.in)) {
    System.out.print("Dammi un numero: ");
    int x = s.nextInt();
    System.out.print("Dammi un altro numero: ");
    int y = s.nextInt();
    System.out.println(STR."""
    Hai inserito \{x} e \{y}
    \{separator}""");
  }
}

private static void file(){
  File f = new File("resources/lez17/testo.txt");
  if (!f.exists()) {
    System.out.println("File does not exists");
    return;
  }
  try {
    System.out.println(f.getCanonicalPath());
    System.out.println(f.getAbsolutePath());
    System.out.println(f.getPath());
  } catch (IOException _){}

  System.out.println("Il file contiene:");
  try (Scanner s = new Scanner(f)) {
    while (s.hasNextLine()){
      System.out.println(s.nextLine());
    }
  } catch (FileNotFoundException e) {
    throw new RuntimeException(e);
  }
}
