package com.company;


import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner Sc = new Scanner(System.in);
    System.out.println("please enter a number :");
    int x = Sc.nextInt();
    divides(x);



  }

  private static void divides(int x) {
    try {
      System.out.println(10/x);

    }catch (ArithmeticException e){
      System.out.println("\"fail\"");
    }
  }
}

