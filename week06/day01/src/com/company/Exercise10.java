package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {
  public static void main(String[] args) {
// Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
// it's up to you how you name/create them! Write a Stream Expression to find the foxes with green color!
// Write a Stream Expression to find the foxes with green color and pallida type!

    Fox fox1 = new Fox("Osama", "Pallida", "green");
    Fox fox2 = new Fox("Haider", "Pallida", "green");
    Fox fox3 = new Fox("Arpi", "Red", "red and white");
    Fox fox4 = new Fox("Alam", "Desert", "green");
    Fox fox5 = new Fox("Shahad", "Pallida", "greyish red");

    List<Fox> foxes = new ArrayList<>();
    foxes.add(fox1);
    foxes.add(fox2);
    foxes.add(fox3);
    foxes.add(fox4);
    foxes.add(fox5);

    List<Fox> greenPallidas = foxes.stream()
        .filter(f -> f.getColor().equals("green"))
        .filter(f -> f.getType().equals("Pallida"))
        .collect(Collectors.toList());
    System.out.println(greenPallidas.get(0).name);
  }
}
