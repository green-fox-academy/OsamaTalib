package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.
    int y = 0;
    int x = 0;
    drawingFunction(x, y, graphics);
  }

  public static void drawingFunction(int x, int y, Graphics graphics) {

    for (int i = 0; i < 4; i++) {
      int z = -20;
      for (int j = 0; j < 16; j++) {
        if (i == 0) {
          z += 20;
          graphics.drawLine(x + z, y, WIDTH / 2, HEIGHT / 2);

        } else if (i == 1) {
          z += 20;
          graphics.drawLine(x + z, y + 320, WIDTH / 2, HEIGHT / 2);

        } else if (i == 2) {
          z += 20;
          graphics.drawLine(x, y + z, WIDTH / 2, HEIGHT / 2);
        } else {
          z += 20;
          graphics.drawLine(x + 320, y + z, WIDTH / 2, HEIGHT / 2);
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
