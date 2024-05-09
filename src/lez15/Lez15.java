import lez15.*;

import java.util.ArrayList;
import java.util.List;

static final String sep = "-------------------------------------------";

void main(){
  genericValue();
  genericCouple();
  genericExtension();
  genericLinkedList();
  genericRestriction1();
  System.out.println(
          STR."""
                  Il polimorfismo sui tipi generici non esiste
                  Ovvero List<Frutto> non è uguale a List<Arancia>
                  \{sep}"""
  );
  jolly1(List.of(1, 2, 3));
  jolly1(List.of("1", "2", "3"));
  jolly2();
  genericRestriction2();
  pecs();
}

private static void pecs(){
  List<? super Integer> a = new ArrayList<>();
  a.add(1);
  a.add(2);
  a.add(3);
  List<? extends Integer> b = new ArrayList<>(List.of(1, 2, 3));
  System.out.println(
          STR."""
                  Producer extends, Consumer supers
                  List<? super Integer>   a=\{a}, a.get(..) non possibile
                  List<? extends Integer> b=\{b}, b.add(..) non possibile
                  \{sep}"""
  );
}

private static void genericRestriction2(){
  List<? super Integer> l1 = new ArrayList<Integer>();
  List<? super Integer> l2 = new ArrayList<Number>();
  List<? super Integer> l3 = new ArrayList<Object>();

  l1.add(1);
  l2.add(2);
  l3.add(3);

  System.out.println(
          STR."""
                  \{l1}
                  \{l2}
                  \{l3}
                  \{sep}"""
  );
}

private static void jolly2() {
  Point<?> p = new Point<>(1, 2);
  System.out.println(STR."\{p.getFirst()} : \{p.getFirst().getClass().getTypeName()}");
  p = new Point<>(1.2, 2.5);
  System.out.println(STR."\{p.getSecond()} : \{p.getSecond().getClass().getTypeName()}");
  System.out.println(sep);
}

private static void jolly1(List<?> l){
  l.forEach(x -> System.out.print(STR."\{x}: \{x.getClass().getTypeName()} "));
  System.out.println();
  System.out.println(sep);
}

private static void genericRestriction1() {
  MyClass<Integer> m = new MyClass<>(1,5);
  System.out.println(
          STR."""
                  max:\{m.max()}, min:\{m.min()}
                  \{sep}"""
  );
}

private static void genericLinkedList() {
  ListaLinkata<Integer> l = new ListaLinkata<>();
  l.addFirst(1);
  l.addFirst(2);
  l.addFirst(3);
  for (var x : l)
    System.out.println(x.get());
  System.out.println(sep);
}

private static void genericExtension() {
  Point<Integer> p = new Point<>(1,2);
  Coppia<Integer, Integer> c = new Coppia<>(1,2);
  //noinspection TrailingWhitespacesInTextBlock,ConstantValue
  System.out.println(STR."""
          p instanceof Coppia = \{p instanceof Coppia}
          c instanceof Point = \{c instanceof Point}
          \{sep}""");
}

private static void genericCouple() {
  Coppia<Integer, Integer> c1 = new Coppia<>(1,2);
  System.out.println(
          STR."""
                  \{c1.getFirst()}, \{c1.getSecond()}
                  \{sep}"""
  );
}

private static void genericValue() {
  Valore<String> v1 = new Valore<>("Yey");
  Valore<Integer> v2 = new Valore<>(1);
  Valore<Valore<String>> v3 = new Valore<>(v1);
  System.out.println(
          STR."""
          \{v1.getType()}: \{v1.get()}
          \{v2.getType()}: \{v2.get()}
          \{v3.getType()}: \{v3.get()}
          \{sep}"""
  );
}
