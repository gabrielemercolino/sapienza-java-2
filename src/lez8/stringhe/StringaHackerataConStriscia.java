package lez8.stringhe;

import lez8.stringhe.StringaHackerata;

public class StringaHackerataConStriscia extends StringaHackerata {
  private final static int MAX_LENGTH = 20;

  public StringaHackerataConStriscia(String s) {
    super(s);
  }

  public String getStriscia(){
    StringBuffer buffer = new StringBuffer();

    for (int i = 0; i < s.length() && i < MAX_LENGTH; i++) buffer.append( i % 2 == 0? "*" : "-");

    return buffer.toString();
  }

  @Override
  public String toString() {
    //noinspection StringTemplateMigration
    return getStriscia() + " " + super.toString() + " " + getStriscia();
  }
}
