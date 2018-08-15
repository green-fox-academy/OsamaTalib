package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {


    // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    String filename = "my-file.txt";

    System.out.println(linesNumber(filename));
  }

  private static long linesNumber(String filename) {

    long x ;
    try {

        x = Files.lines(Paths.get(filename)).count();




    } catch (IOException e) {
      return 0;
    }
    return x;
  }
}