package lez3;

public class Counter {
  private int count;

  /**
   * Utility constructor for starting at 0
   */
  public Counter(){
    this(0);
  }

  /**
   * Constructor with default value
   * @param start starting value
   */
  public Counter(int start){
    count = start;
  }

  /**
   * Adds 1 to the current count
   */
  public void increment(){
    increment(1);
  }

  /**
   * Adds the specified value to the current count
   * @param value
   */
  public void increment(int value){
    count += value;
  }

  public int getCount(){
    return count;
  }

  /**
   * Resets the current count at 0
   */
  public void reset(){
    reset(0);
  }

  /**
   * Resets the current count at the specified value
   * @param value
   */
  public void reset(int value){
    count = value;
  }
}
