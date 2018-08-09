package com.company;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    // Create a function that takes 1 parameter:
    // An array of {x, y} points
    // and connects them with green lines.
    // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}

    ArrayList<Object> One = new ArrayList<>(Arrays.asList(10, 10, 290, 10, 290, 290, 10, 290, Color.green, 50, 100, 70, 70, 80, 90, 90, 90, 100, 70,
        120, 100, 85, 130, 50, 100));
    drawingFunction(One, graphics);

  }

  public static void drawingFunction(ArrayList<Object> One, Graphics graphics) {

    int x = -1;
    int y = 0;
    int z=-1;
    int v=0;
    for (int i = 0; i < 4; i++) {
      x += 1;
      y += 1;
      graphics.setColor((Color) One.get(8));
      if (i < 3) {
        graphics.drawLine((Integer) One.get(i + x), (Integer) One.get(i + y), (Integer) One.get(i + 2 + x), (Integer) One.get(i + 2 + y));
      } else {
        graphics.drawLine((Integer) One.get(i + x), (Integer) One.get(i + y), (Integer) One.get(i - 3), (Integer) One.get(i - 3));
      }}
      for (int j=9;j<16;j++){
        z += 1;
        v += 1;
        graphics.drawLine((Integer) One.get(j + z), (Integer) One.get(j + v), (Integer) One.get(j + 2 + z), (Integer) One.get(j + 2 + v));
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


// create a 300x300 canvas.