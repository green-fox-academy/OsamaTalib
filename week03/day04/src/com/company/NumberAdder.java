package com.company;

import java.util.Scanner;

public class NumberAdder {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(adds_numbers(number));

  }

  private static int adds_numbers(int number) {
    if (number == 0) {
      return 0;
    }
    return number + adds_numbers(number - 1);
  }
}
