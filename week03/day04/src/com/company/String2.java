package com.company;

import java.util.Scanner;

public class String2 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    Scanner scanner = new Scanner(System.in);
    String word = scanner.next();

    String word2 = wordWithY(word);
    System.out.println(wordWithouty(word2));


  }

  private static String wordWithouty(String word2) {
    int y = word2.indexOf('y');
    if (y <= -1) {
      return word2;
    } else {
      word2 = word2.substring(0, y) + word2.substring(y+1);
      return wordWithouty(word2);

    }
  }

  private static String wordWithY(String word) {
    int x = word.indexOf('x');
    if (x == -1) {
      return word;
    } else {
      word = word.substring(0, x) + "y" + word.substring(x + 1);
      return wordWithY(word);

    }

  }
}

