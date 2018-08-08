package com.company;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
  public static void mainDraw(Graphics graphics) {
    // Draw the canvas' diagonals.
    // If it starts from the upper-left corner it should be green, otherwise it should be red.
    graphics.setColor(Color.green);
    graphics.drawLine(200, 400, 600, 400);
    int x =0;
    for (int i =0; i < 20 ; i++) {

      graphics.setColor(Color.red);
      x +=10;
      graphics.drawLine(200+x, 400-x, 600-x, 400+x);
    }
    int z =0;
    for (int j =0; j < 19 ; j++) {

      graphics.setColor(Color.black);
      z +=10;
      graphics.drawLine(400+z, 200+z, 400-z, 600-z);
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}