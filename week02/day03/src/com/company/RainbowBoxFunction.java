package com.company;
import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.

    int squaresSize = 1280;
    HashMap<Integer, Color> hashColors = new HashMap<>();

    hashColors.put(1, Color.RED);
    hashColors.put(2, Color.ORANGE);
    hashColors.put(3, Color.YELLOW);
    hashColors.put(4, Color.GREEN);
    hashColors.put(5, Color.BLUE);
    hashColors.put(6, new Color(111, 0, 255));
    hashColors.put(7, new Color(127, 0, 255));;

    squareDrawingFunction(squaresSize,hashColors,graphics );

  }

  public static void squareDrawingFunction(int squaresSize, HashMap<Integer, Color> hashColors, Graphics graphics) {
    int z = -15;
    int y= -40;
    int squaresWidth = squaresSize/4;
    int squaresHeight = squaresSize/4;
    for (int i = 1; i < 8; i++){
      z+= 15;
      y+= 30;
      graphics.setColor(hashColors.get(i));
      graphics.fillRect((WIDTH/2)-((squaresWidth/2)-z), (HEIGHT/2)-((squaresHeight/2)-z), squaresWidth-y, squaresHeight-y);


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