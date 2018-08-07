package com.company;

import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    // - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
    int m = 6;
    int result = sum(m);
    System.out.println(result);
  }
  public static int sum( int x)
  {
    int m = 0;
    for ( int i =0; i<=x; i++)
    {
      m  += i;

    }
    return m;
  }
}
