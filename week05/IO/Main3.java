package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // write your code here
    List<String> stringLin;

    stringLin = lins("lottery.txt");

    List<String> listOfNumbers = new ArrayList<>();
    for (String line : stringLin) {
      String[] lineArray = line.split(";");
      for (int i = lineArray.length - 1; i > lineArray.length - 6; i--) {
        listOfNumbers.add(lineArray[i]);
      }
    }
    HashMap<String, Integer> mapOfInteger = new HashMap<>();

    for (int i = 0; i < listOfNumbers.size(); i++) {
      if (!mapOfInteger.containsKey(listOfNumbers.get(i))) {
        mapOfInteger.put(listOfNumbers.get(i), 1);
      } else {
        mapOfInteger.put(listOfNumbers.get(i), mapOfInteger.get(listOfNumbers.get(i)) + 1);
      }

    }
    ArrayList<String> finalNumber = new ArrayList<>();
    String keyNumber = "";
    while (finalNumber.size() < 5) {
      int temp = 0;
      for (String key : mapOfInteger.keySet()) {
        if (mapOfInteger.get(key) > temp) {
          temp = mapOfInteger.get(key);
          keyNumber = key;
        }
      }
      mapOfInteger.remove(keyNumber);
      finalNumber.add(keyNumber);

    }
    System.out.println(finalNumber);
  }

  private static List<String> lins(String textLine) {
    List<String> stringLin = new ArrayList<>();
    Path filePath = Paths.get(textLine);

    try {
      stringLin = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return stringLin;
  }


}
