package lez12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lez12 {
  private final static String separator = "----------------------------------------";

  public static void main(String[] args) {
    listIterator();
    treeSet();
    hashMap();

    wordCount();
    riferimentiAMetodi();
    comparator();
    comparator2();
    predicate();
    predicate2();
  }

  private static void predicate2() {
    Predicate<String> p = String::isEmpty;
    System.out.println(p.negate().test(separator));
    System.out.println(separator);
  }

  private static void predicate() {
    Predicate<String> p = s -> !s.isEmpty();
    System.out.println(p.test("kek"));
    System.out.println(p.test(""));
    System.out.println(separator);
  }

  private static void comparator2() {
    Comparator<NomeCognome> comparator = (p1, p2) -> p1.getNome().compareTo(p2.getNome());
    NomeCognome p1 = new NomeCognome("John", "Doe");
    NomeCognome p2 = new NomeCognome("Alice", "Wonderland");
    System.out.println(comparator.compare(p1, p2));
    System.out.println(comparator.reversed().compare(p1, p2));
    Comparator<NomeCognome> comp2 = Comparator.comparing(NomeCognome::getNome);
    Comparator<NomeCognome> comp3 = Comparator.comparing(NomeCognome::getNome).thenComparing(NomeCognome::getCognome);
    System.out.println(separator);
  }

  private static void comparator() {
    String[] a = new String[]{"a", "c", "b"};
    Arrays.sort(a, String::compareTo);
    System.out.println(Arrays.toString(a));
    System.out.println(separator);
  }

  private static void riferimentiAMetodi() {
    Function<String, Integer> converter = Integer::valueOf;
    int converted = converter.apply("123");
    System.out.println(converted + 1);
    System.out.println(separator);
  }

  private static void wordCount() {
    try {
      Scanner in = new Scanner(new File("resources/lez12.txt"));
      Map<String, Integer> hm = new HashMap<>();
      Map<String, Integer> tm = new TreeMap<>();
      Map<String, Integer> lm = new LinkedHashMap<>();

      while (in.hasNext()) {
        String parola = in.next();
        Integer frequenza = hm.get(parola);
        if (frequenza == null) {
          hm.put(parola, 1);
          tm.put(parola, 1);
          lm.put(parola, 1);
        } else {
          hm.put(parola, frequenza + 1);
          tm.put(parola, frequenza + 1);
          lm.put(parola, frequenza + 1);
        }
      }

      System.out.println(hm);
      System.out.println(tm);
      System.out.println(lm);
    } catch (FileNotFoundException e) {
      System.err.println("File not found");
    }
    System.out.println(separator);
  }

  private static void hashMap() {
    Map<String, Integer> m = new HashMap<>();
    m.put("kek", 1);
    System.out.println(m.get("Kek"));
    System.out.println(m.get("kek"));
    Set<Map.Entry<String, Integer>> es = m.entrySet();
    System.out.println(es);
    System.out.println(separator);
  }

  private static void treeSet() {
    Set<String> nomi = new TreeSet<>();
    Set<String> cognomi = new TreeSet<>();

    nomi.add("Mario");
    cognomi.add("Rossi");
    nomi.add("Mario");
    cognomi.add("Bianchi");
    nomi.add("Mario");
    cognomi.add("Verdi");
    nomi.add("Luigi");
    cognomi.add("Rossi");
    nomi.add("Luigi");
    cognomi.add("Bianchi");

    System.out.println(nomi); // Ordinamento naturale siccome è un tree set
    System.out.println(cognomi);
    System.out.println(separator);
  }

  private static void listIterator() {
    List<Integer> l = new LinkedList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);

    ListIterator<Integer> li = l.listIterator();
    while (li.hasNext()) System.out.println(li.next());
    System.out.println();
    while (li.hasPrevious()) System.out.println(li.previous());
    System.out.println(separator);
  }
}