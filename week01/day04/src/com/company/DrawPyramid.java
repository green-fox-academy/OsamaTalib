package com.company;

import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
    Scanner Sc = new Scanner(System.in);
    System.out.println("Please inter a number :");
    int one = Sc.nextInt();
    String x = "";
    for (int i = 0; i < one; i++) {
      for (int j = 0; j < one - i; j++) {
        System.out.print(" ");
      }
        x = x + "*";
        System.out.print(x);
        x = x + "*";
      System.out.println();
      }

    }


  }

