package com.company;
import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    ArrayList<Object> color = new ArrayList<Object>();

    int y = -40;
    for (int i = 0; i < 8; i++) {
      y += 40;
      int x = -40;
      for (int j = 0; j < 8; j++) {
        x += 40;
        if ((j % 2 == 0 && i%2 !=0) || (j%2 !=0 && i % 2 == 0 )) {
          graphics.setColor(Color.white);
          graphics.fillRect(0+x, 0 + y, 40, 40);
        } else {graphics.setColor(Color.BLACK);
          graphics.fillRect(0+x, 0 + y, 40, 40);

        }
      }
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