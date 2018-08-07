package com.company;


import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    //System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
    int[] a = new int[]{1, 11, 34, 11, 52, 61, 1, 34};

    System.out.print(Arrays.toString(unique(a)));
  }


  private static int[] unique(int[] y) {

    //check if it is equal
    int x = y.length - 1;
int z =0;
    for (int i = 0; i < y.length; i++)
      for (int j = i + 1; j < y.length; j++){
        if (y[i] == y[j]) {
          z++;
          int temp = y[j];
          if (j != y.length - 1) {
            System.arraycopy(y, j + 1, y, j, y.length - j - 1);
            y[x] = temp;

          }
          }

        }
        z=(z/2);
        int [] v = new int[y.length-z];
    System.arraycopy(y, 0, v, 0, y.length - z);
    return v;
  }

}