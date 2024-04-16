package lez8;

public class Punto {
  private int x, y, z;

  public Punto(int x, int y, int z){
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    System.out.println("not null");
    if (this == o) return true;
    System.out.println("not the same pointer");

    if ( getClass() != o.getClass()) return false;
    //if (!(o instanceof Punto p)) return false;
    System.out.println("object of the same type");

    Punto p = (Punto)o;
    return x == p.x && y == p.y && z == p.z;
  }
}
