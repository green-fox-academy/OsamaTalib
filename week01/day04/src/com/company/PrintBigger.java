package com.company;

import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {

// Write a program that asks for two numbers and prints the bigger one
    Scanner Sc = new Scanner(System.in);
    System.out.println("please inter two number");
    int one = Sc.nextInt();
    int two = Sc.nextInt();
    if (one > two){
      System.out.println(one);
    }else {
      System.out.println(two);
    }
  }
}
