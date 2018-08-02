package com.company;

import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    Scanner SC = new Scanner(System.in);
    System.out.println("Please inter the distance in Kilometers :");

    double distanceInkilometers = SC.nextDouble();

    double distanceInmiles = distanceInkilometers *  0.62137 ;

    System.out.println(distanceInmiles);

  }
}
