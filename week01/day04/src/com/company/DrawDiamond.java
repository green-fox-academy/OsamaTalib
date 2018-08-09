package com.company;

import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Please inter a number :");
    int num = Sc.nextInt();
    int x = 0;
    if (num % 2 == 0) {
      num += 1;
    }
    for (int i = 0; i < (num / 2) + 1; i++) {
      for (int j = 0; j < (num / 2) + 1 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= x; k++) {
        System.out.print("*");
      }
      System.out.println();
      x += 2;
    }

    int y = (num / 2) + 2;

    for (int i = (num / 2); i > 0; i--) {
      for (int j = 0; j < ((num / 2) + 2) - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < y; k++) {
        System.out.print("*");
      }
      System.out.println();
      y -= 2;
    }
  }
}
