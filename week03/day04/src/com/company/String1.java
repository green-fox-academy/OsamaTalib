package com.company;

import java.util.Scanner;

public class String1 {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
    Scanner scanner = new Scanner(System.in);
    String word = scanner.next();

    System.out.println(wordWithY(word));

  }

  private static String wordWithY(String word) {
int x = word.indexOf('x');
if (x == -1){
  return word;}
  else {
  word = word.substring(0,x)+"y"+word.substring(x+1);
  return wordWithY(word);

    }

  }
}
