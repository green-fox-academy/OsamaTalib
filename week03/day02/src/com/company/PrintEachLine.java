package com.company;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
      // Write a program that opens a file called "my-file.txt", then prints
      // each of the lines form the file.
      // If the program is unable to read the file (for example it does not exists),
      // then it should print an error message like:
      try {
       List<String> x = Files.readAllLines(Paths.get("my-file.txt"));
       for(String y : x){
         System.out.println(y);
      }} catch (IOException e) {
        System.out.println("Unable to read file: my-file.txt");
      }


    }
  }
