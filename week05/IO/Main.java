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
    String firstCompany = "marvel.csv";
    String secondCompany = "paramount.csv";
    MostProductiveYear(firstCompany);
    MostProductiveYear(secondCompany);
  }

  private static void MostProductiveYear(String companyName) {
    List<String> companyData = new ArrayList<>();
    Path filePath = Paths.get(companyName);
    try {
      companyData = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    HashMap<String, Integer> productionYears = new HashMap<>();
    for (String line : companyData) {
      String[] temp = line.split(",");
      if (!productionYears.containsKey(temp[temp.length - 2])) {
        productionYears.put(temp[temp.length - 2], 1);
      } else {
        productionYears.put(temp[temp.length - 2], productionYears.get(temp[temp.length - 2]) + 1);
      }
    }
    int temp =0;
    String mostProductionYear ="";
    for (String test : productionYears.keySet()) {
      if (productionYears.get(test) > temp){
        temp = productionYears.get(test);
        mostProductionYear =test;
      }
    }
    System.out.println(mostProductionYear);
  }
}
