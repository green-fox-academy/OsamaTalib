package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
  public static void main(String[] args) {
   // Write a Stream Expression to find the uppercase characters in a string!
    String text = "Talib";
    List<String> upperCase =text.chars()
        .filter(n -> n >= 65 && n <=90)
        .mapToObj(n -> Character.toString((char) n))
        .collect(Collectors.toList());
    System.out.println(upperCase);

  }
}
