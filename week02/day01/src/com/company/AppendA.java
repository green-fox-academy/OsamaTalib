package com.company;

public class AppendA {
  public static void main(String[] args) {
    // - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end
    String[] animal = new String[3];
    animal[0] = "koal";
    animal[1] = "pand";
    animal[2] = "zebr";
    for (int i = 0; i < animal.length; i++) {
      animal[i] = animal[i] + "a";
    }
    for (String x : animal) {
      System.out.println(x);
    }
  }
}