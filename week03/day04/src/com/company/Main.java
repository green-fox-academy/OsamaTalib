package com.company;

public class Main {

  public static void main(String[] args) {
// Write a recursive function that takes one parameter: n and counts down from n.
        int n = 6;
    counts_down(n);

  }

  private static void counts_down(int n) {

   for (int i = n ; i>=0 ; i--){
     System.out.println(i);
   }

  }
}
