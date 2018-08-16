package com.company;

public class Refactorio {
  public static void main(String[] args) {
// Create a recursive function called `refactorio`
// that returns it's input's factorial
    int n = 9;
    System.out.println(refactorio(n));

  }

  private static int refactorio(int n) {
    if (n == 1){
      return n;
    }else {
      return n * refactorio(n-1);
    }

  }
}
