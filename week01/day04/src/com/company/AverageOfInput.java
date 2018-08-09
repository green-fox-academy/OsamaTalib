package com.company;

import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("please inter five number :");
    int sum =0;
    double ave ;
    for (int i = 0; i<5; i++){
      sum += Sc.nextInt();
    }
    System.out.println("Sum: " + sum + " Average: " + (sum/5));
  }
}
