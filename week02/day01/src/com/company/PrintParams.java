package com.company;

import java.util.Scanner;

public class PrintParams {
  public static void main(String[] args) {

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")

    String x = "first";
    printParams(x);
  }

  public static void printParams(String... y)
  {
    for (String i : y){

System.out.print(i);
  }

}}
