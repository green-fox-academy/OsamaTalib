package com.company;

import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8
    int a = 8;
    Scanner Sc = new Scanner(System.in);
    System.out.println("Please guess the hidden number :");
    int b = Sc.nextInt();
    while (b != a) {
      if (a > b) {
        System.out.println("The stored number is higher");
        System.out.println("please choose another number");
        b = Sc.nextInt();
      } else {
        {
          System.out.println("The stored number is lower");
          System.out.println("please choose another number");
          b = Sc.nextInt();
        }
      }
    }

    System.out.println("You found the number: 8");

  }
}
