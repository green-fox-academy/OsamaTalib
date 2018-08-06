package com.company;

import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
    Scanner Sc = new Scanner(System.in);
    System.out.println("Please print a number :");
    int a = Sc.nextInt();
    for (int i = 1; i <= a; i++) {
      int b = i;
      while (b > 0) {
        System.out.print("*");
        b--;
      }
      System.out.println();
    }
  }
}