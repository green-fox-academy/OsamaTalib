package com.company;

import java.util.Scanner;

public class String3 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
    Scanner scanner = new Scanner(System.in);
    String word = scanner.next();
    System.out.println(separate(word));
  }

  private static String separate(String word) {
    if (word.length()<=1){
      return word;
    }else {
     return word.substring(0,1)+"*"+separate(word.substring(1));
    }
  }
}
