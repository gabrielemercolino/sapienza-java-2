import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

void main(){
  bufferedReader();
}

private static void bufferedReader() {
  try(var br = new BufferedReader(new FileReader("resources/lez18/testo.txt"))) {
    while (br.ready()){
      System.out.println(br.readLine());
    }
  } catch (FileNotFoundException e) {
    System.err.println("File non trovato");
  } catch (IOException e) {
    throw new RuntimeException(e);
  }
}
