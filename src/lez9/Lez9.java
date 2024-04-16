import lez9.successioni.Casuale;
import lez9.successioni.Fibonacci;

void main() {
  Fibonacci f = new Fibonacci(10);

  for (int i : f) {
    System.out.println(i);

    for (int j : new Casuale(i)) {
      System.out.printf("%s ", j);
    }

    System.out.println();
  }
}
