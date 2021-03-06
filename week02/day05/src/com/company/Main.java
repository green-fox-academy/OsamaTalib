package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    graphics.setColor(Color.magenta);
    int x = 0;
    for (int i = 0; i < 13; i++) {
      graphics.setColor(Color.magenta);
      graphics.drawLine(30 + x, 5, 280, 20 + x);
      graphics.setColor(Color.green);
      graphics.drawLine(5, 30 + x, 20 + x, 280);
      x += 20;
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
