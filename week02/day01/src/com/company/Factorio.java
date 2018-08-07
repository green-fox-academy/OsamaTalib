package com.company;

public class Factorio {
  public static void main(String[] args) {
    // - Create a function called `factorio`
//   that returns it's input's factorial
    int x = 6;
    System.out.println(factorio(x));

  }

  public static int factorio(int y) {
    if (y == 0) {
      return 1;
    } else {

      int fac = 1;
      for (int i = 1; i <= y; i++) {
        fac *= i;
      }
      return fac;
    }
  }
}

