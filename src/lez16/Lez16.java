import lez16.pecs.Frutto;
import lez16.pecs.Mela;
import lez16.pecs.Pera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

void main(){
  arrays();
}

private static void arrays(){
  Mela[] mele = new Mela[] {new Mela(), new Mela()};
  Pera[] pere = new Pera[] {new Pera(), new Pera()};

  try {
    copy(mele, pere);
  } catch (ArrayStoreException e){
    System.err.println(STR."kek \{e}");
  }

  List<Mela> lMele = Arrays.stream(mele).toList();
  List<Pera> lPere = Arrays.stream(pere).toList();

  // Non si può usare
  // copyNoPecs(lMele, lPere);

  List<Frutto> lfrutti = new ArrayList<>(Arrays.asList(mele));
  // Non funziona perchè non c'è polimorfismo sul tipo generico
  //copyNoPecs(lMele, frutti);

  // Ora funziona perchè la prima, che è producer, estende e la seconda, consumer, supers
  copy(lMele, lfrutti);
  System.out.println(lfrutti);
}

private static <T> void copy(T[] src, T[] dest){
  // src:  producer
  // dest: consumer
  dest[0] = src[0];
}

private static <T> void copyNoPecs(List<T> src, List<T> dest){
  dest.addAll(src);
}

private static <T> void copy(List<? extends T> src, List<? super T> dest){
  dest.addAll(src);
}