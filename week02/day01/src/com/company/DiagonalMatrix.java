package com.company;

import java.util.Arrays;

public class DiagonalMatrix {
  public static void main(String[] args) {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    int [][] a = new int[4][4];
    for (int i = 0; i< a.length; i++)
    for (int j = 0; j < a[i].length; j++){
      if (i == j){
        a[i][j]= 1;
      }
      else{
        a[i][j]= 0;
      }

    }
    System.out.println(Arrays.deepToString(a));
    }
  }
