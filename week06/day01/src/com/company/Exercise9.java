package com.company;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
//    Write a Stream Expression to convert a char array to a string!

    char [] someChar = new char[]{'o','s','a','m','a'};
    String name = new String(someChar).chars()
        .mapToObj(c -> Character.toString ((char) c))
        .collect(Collectors.joining());
    System.out.println(name);

  }
}
