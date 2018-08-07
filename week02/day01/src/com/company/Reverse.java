package com.company;

public class Reverse {
  public static void main(String[] args) {
    // - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
    int[] aj = new int[]{3, 4, 5, 6, 7};
    int temp;

    for (int i = 0; i < 5 / 2; i++) {
      temp = aj[i];
      aj[i] = aj[5 - 1 - i];
      aj[5 - 1 - i] = temp;
    }
for ( int y : aj)
{ System.out.print(y);
}}}
