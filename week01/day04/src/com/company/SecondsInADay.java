package com.company;

public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
    int remainingHours = 24 % currentHours - 1;
    int remainingMinutes = 60 % currentMinutes - 1;
    int remainingSeconds = 60 % currentSeconds;
    remainingSeconds += (remainingHours * 60 * 60) + (remainingMinutes * 60);

    System.out.println("remaining Ssconds is " + remainingSeconds);

  }
}

