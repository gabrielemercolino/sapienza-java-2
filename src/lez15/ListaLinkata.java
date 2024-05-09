package lez15;

import java.util.Iterator;

public class ListaLinkata<T> implements Iterable<ListaLinkata.Elemento<T>>{
  private Elemento<T> testa;

  @Override
  public Iterator<Elemento<T>> iterator() {
    return new Iterator<Elemento<T>>() {
      private Elemento<T> current = testa;
      @Override
      public boolean hasNext() {
        return current != null;
      }

      @Override
      public Elemento<T> next() {
        var res = current;
        current = current.next;
        return res;
      }
    };
  }

  public static class Elemento<T>{
    T val;
    Elemento<T> next;
    Elemento(T val, Elemento<T> next){
      this.val = val;
      this.next = next;
    }

    public T get() {
      return val;
    }
  }

  public void addFirst(T val){
    testa = new Elemento<>(val, testa);
  }

  public T removeFirst(){
    var res = testa;
    testa = testa.next;
    return res.val;
  }
}
