package com.company;

import java.util.Scanner;

public class SumDigit {
  static int sum=0;

  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    if (number >= 0) {

      System.out.println(sum_digits(number));
    }

  }

  private static int sum_digits(int number) {
    if (number == 0) {
      return sum;
    } else {
      sum += number % 10 ;
      number= number/10;

      return sum_digits(number);

    }
  }
}
