package com.company;

import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
    Scanner Sc = new Scanner(System.in);
    System.out.println("Please enter a number of how many integers you ned to sum :");
    int num = Sc.nextInt();
    System.out.println("Please enter the " + num + "integers  : ");
    int num2 = 0;
    for (int i = 0; i < num; i++) {
       num2 += num2 + Sc.nextInt();
    }
    System.out.println("Sum: " + num2 + "Average: " + num2/num);
  }
}
