package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    Path myPath = Paths.get("log.txt");
    List<String> content = null;
    try {
      content = Files.readAllLines(myPath);
    } catch (IOException e) {
      System.out.println("File not reachable");
    }

    for (String IP : uniqeIp(content)) {
      System.out.println(IP);
    }

    System.out.println(ratioCalculator(content));
  }

  static String[] uniqeIp(List<String> content) {
    List<String> uniqeList = new ArrayList<>();
    for (String line : content) {
      String[] lineParts = line.split("\\s+");
      if (!uniqeList.contains(lineParts[5])) {
        uniqeList.add(lineParts[5]);

      }
    }
    String[] uniqueArray = new String[uniqeList.size()];
    for (int j = 0; j < uniqueArray.length; j++) {
      uniqueArray[j] = uniqeList.get(j);
    }
    return uniqueArray;
  }

  static double ratioCalculator(List<String> content) {
    int postCounter = 0;
    int getCounter = 0;
    for (String line : content) {
      String[] lineParts = line.split("\\s+");
      if (lineParts[6].equals("POST")) {
        postCounter++;
      } else if (lineParts[6].equals("GET")) {
        getCounter++;
      }
    }
    return (double) getCounter / postCounter;
  }
}