package com.company;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {

// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.
    Scanner Sc = new Scanner(System.in);
    System.out.println(" please inter a number :");
    int a = Sc.nextInt();

    if (a % 2 ==0) {
      System.out.println("Thw number is even");
    }
    else {
      System.out.println("The number is odd");
    }
  }
}
