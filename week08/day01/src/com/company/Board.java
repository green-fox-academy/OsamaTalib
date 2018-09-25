package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

class Board extends JComponent  {

  King blackKing;
  King whitKing;
  Queen queen;
  Bishop bishop;
  Knight knight;
  Rook rook;
  Pawn pawn;
  ArrayList<Character> gameObject = new ArrayList<>();
  public int[][] floorMap = {{1, 0, 1, 0, 1, 0, 1, 0},
      {0, 1, 0, 1, 0, 1, 0, 1},
      {1, 0, 1, 0, 1, 0, 1, 0},
      {0, 1, 0, 1, 0, 1, 0, 1},
      {1, 0, 1, 0, 1, 0, 1, 0},
      {0, 1, 0, 1, 0, 1, 0, 1},
      {1, 0, 1, 0, 1, 0, 1, 0},
      {0, 1, 0, 1, 0, 1, 0, 1}};

  public Board() {
    blackKing = new King("img/black-King.png", 0, 5);
    whitKing = new King("img/whit-King.png", 0, 4);
//    boss = new Boss("img/boss.png", 9, 9);
//    skeleton1 = new Skeleton("img/skeleton.png", 0, 9);
//    skeleton2 = new Skeleton("img/skeleton.png", 2, 5);
//    skeleton3 = new Skeleton("img/skeleton.png", 5, 2);
    gameObject.add(blackKing);
    gameObject.add(whitKing);
//    gameObject.add(skeleton1);
//    gameObject.add(skeleton2);
//    gameObject.add(skeleton3);
//    gameObject.add(boss);


    // set the size of your draw board
    setPreferredSize(new Dimension(640, 640));
    setVisible(true);
  }


  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    drawMap(graphics);
//    drawStats(graphics);
    for (int j = 0; j < gameObject.size(); j++) {

      gameObject.get(j).draw(graphics);
    }
  }


  public void drawMap(Graphics graphics) {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        PositionedImage image;
        if (floorMap[j][i] == 1) {
          image = new PositionedImage("img/prown.png", i, j);
        } else {
          image = new PositionedImage("img/whit.png", i, j);
        }
        image.draw(graphics);
      }
    }
  }
}
