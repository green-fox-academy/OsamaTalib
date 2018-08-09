package com.company;

import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was
    Scanner Sc = new Scanner(System.in);
    System.out.println("Please inter a number :");
    int num = Sc.nextInt();
    for (int i =0; i<num; i++){
      for (int j = 0; j <num-1; j++){
        if (i ==0 ||i == num-1 || j==0 || j ==num-2){
          System.out.print("%");
        }else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

}