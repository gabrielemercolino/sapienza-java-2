import lez8.Punto;
import lez8.stringhe.*;
import lez8.animali.*;

import java.util.List;

void main() {
  Animale a = new Gatto();
  a.emettiVerso();
  a = new Chihuahua();
  a.emettiVerso();

  System.out.println("-----------");
  List<Animale> animali = List.of(new Gatto(), new Chihuahua(), new Gatto());
  animali.forEach(Animale::emettiVerso);

  System.out.println("-----------");
  StringaHackerata s = new StringaHackerataConStriscia("Drago della programmazione");
  System.out.println(s);
  System.out.println(s.getClass());

  System.out.println("-----------");
  Punto p1 = new Punto(1, 2, 3);
  Punto p2 = new Punto(1, 2, 3);
  if (p1.equals(p2)) {
    System.out.println("equals");
  }
}
