package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
    Scanner Sc = new Scanner(System.in);
    System.out.println("Please inter the chickens number :");
    int num1 = Sc.nextInt();
    System.out.println("Please inter the pigs number :");
    int num2 = Sc.nextInt();
    System.out.println("the legs  that all the animals have is :" +((num1*2)+(num2*4)));
  }
}
