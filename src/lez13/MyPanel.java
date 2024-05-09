package lez13;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
  public MyPanel(){
    super();
    Dimension d = new Dimension(400, 400);
    setSize(d);
    setMinimumSize(d);
    add(new JLabel("Cringe"));
  }
}
