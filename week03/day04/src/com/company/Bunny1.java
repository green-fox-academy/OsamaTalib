package com.company;

import java.util.Scanner;

public class Bunny1 {


  public static void main(String[] args) {

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    System.out.println(bunnies(number));

  }

  private static int bunnies(int number) {
    if (number == 0) {
      return 0;
    }else {

      return 2+ bunnies(number-1);
    }
  }
}
