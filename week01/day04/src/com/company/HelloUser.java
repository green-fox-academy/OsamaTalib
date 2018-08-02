package com.company;

import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    Scanner Sc = new Scanner(System.in);

    System.out.println("please inter your name : ");
    String Name = Sc.nextLine();

    System.out.println( "Hello, " + Name);
  }
}
