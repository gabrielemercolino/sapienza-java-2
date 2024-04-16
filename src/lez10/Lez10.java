import lez10.Formula;
import lez10.Tastiera;
import lez10.interfaces.clone.IntVector;
import lez10.interfaces.disambiguazione.C;
import lez10.interfaces.enums.OperatoriDiBase;

void main(){
  interfacesDisambiguation();
  enumsAndInterfaces();
  shallowCopy();
  deepCopy();

  nestedClass();
  anonymusClass();
  lambdaExpression();
}

private static void lambdaExpression() {
  System.out.println("Lambda");
  Runnable runnable = () -> System.out.println("Kekw");
  runnable.run();
  System.out.println();
}

private static void anonymusClass() {
  System.out.println("Classi anonime");
  Formula f1 = new Formula() {
    @Override
    public double calculate(double a) {
      return sqrt(a * 100);
    }
  };
  // Siccome è una functional interface
  Formula f2 = a -> a * a;
  System.out.println(STR."f(x)=x*100 | x=10 -> \{f1.calculate(10)}");
  System.out.println(STR."f(x)=x*x   | x=10 -> \{f2.calculate(10)}");
  System.out.println();
}

private static void nestedClass() {
  System.out.println("Tastiera");
  Tastiera t = new Tastiera("Bo", new char[]{'a'});
  System.out.println(t);
  System.out.println();
}

private static void deepCopy() {
  System.out.println("Deep copy");
  IntVector k1 = new IntVector(1, 2, 3);
  k1.toggleDeepCopy();
  IntVector k2 = k1.clone();
  k1.add(69);
  System.out.println((k1.list == k2.list)? "Stessa lista" : "Lista diversa");
  //noinspection TrailingWhitespacesInTextBlock
  System.out.println(STR."""
          Prima lista:    \{k1.list}
          Seconda lista:  \{k2.list}
          """);
}

private static void shallowCopy() {
  System.out.println("Shallow copy");
  IntVector k1 = new IntVector(1, 2, 3);
  IntVector k2 = k1.clone();
  k1.add(69);
  System.out.println((k1.list == k2.list)? "Stessa lista" : "Lista diversa");
  //noinspection TrailingWhitespacesInTextBlock
  System.out.println(STR."""
          Prima lista:    \{k1.list}
          Seconda lista:  \{k2.list}
          """);
}

private static void enumsAndInterfaces() {
  System.out.println("Enumerazioni ed interfacce");
  OperatoriDiBase operatore = OperatoriDiBase.SOMMA;
  double res = operatore.apply(1., 2.);
  System.out.println(res);

  System.out.println();
}

private static void interfacesDisambiguation() {
  System.out.println("Disambiguazione metodi statici delle interfacce");
  C c = new C();
  c.metodo();

  System.out.println();
}