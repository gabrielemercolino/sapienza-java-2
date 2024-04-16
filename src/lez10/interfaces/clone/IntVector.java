package lez10.interfaces.clone;

import java.util.ArrayList;
import java.util.List;

public class IntVector implements Cloneable{
  public List<Integer> list;
  private boolean useDeepCopy;
  public IntVector(int... values){
    list = new ArrayList<>();
    for (int v : values) list.add(v);
  }

  public void add(int val){
    list.add(val);
  }

  public void toggleDeepCopy(){
    useDeepCopy = !useDeepCopy;
  }

  @Override
  public IntVector clone() {
    try {
      IntVector iv2 = (IntVector) super.clone();
      if (useDeepCopy) iv2.list = new ArrayList<>(list);
      return  iv2;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
}
