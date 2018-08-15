package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
    Path x = Paths.get("my-file.txt");
    Path y = Paths.get("newfile.txt");
    System.out.println(copyfun(x, y));
  }

  private static boolean copyfun(Path x, Path y) {
    try {
      Files.copy(x, y);
    } catch (IOException e) {
      return false;
    }
    return true;
  }
}
