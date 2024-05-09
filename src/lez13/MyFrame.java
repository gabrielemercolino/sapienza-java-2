package lez13;

import javax.swing.*;

public class MyFrame extends JFrame {
  public MyFrame(){
    JPanel panel = new MyPanel();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().add(panel);
    pack();
    setLocationRelativeTo(null);
    setMinimumSize(panel.getMinimumSize());
  }
}
