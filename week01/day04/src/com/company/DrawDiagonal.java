package com.company;

import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
    Scanner Sc = new Scanner(System.in);
    int x = Sc.nextInt();
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x; j++) {
        if (i == 0) {
          System.out.print("%");
        } else if (j == 0) {
          System.out.print("%");
        } else if (i == x - 1) {
          System.out.print("%");

        } else if (j == x - 1) {
          System.out.print("%");
        } else if (i == j)
          System.out.print("%");
        else {
          System.out.print(" ");
        }

      }
      System.out.println();

    }
  }
}
