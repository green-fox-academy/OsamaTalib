package com.company;

import java.util.Map;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
    // Write a Stream Expression to find the frequency of characters in a given string!
String text = "osama";
    Map<Character, Long> mapOfOccurences = text.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

    System.out.println(mapOfOccurences);
  }
}
