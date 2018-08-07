package com.company;

public class SwapElements {
  public static void main(String[] args) {
    // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
    String [] abd = new String[]{"first", "second", "third"};
    String x = abd[0];
    abd[0] = abd[2];
    abd[2] = x;
    for (String y : abd)
    {
      System.out.println(y);
    }

  }
}
