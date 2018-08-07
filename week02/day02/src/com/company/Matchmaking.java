package com.company;
import java.util.*;

public class Matchmaking{
  public static void main(String... args){
    ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }
  public static ArrayList<String> makingMatches(ArrayList<String>girls,ArrayList<String>boys)
  {
    ArrayList<String> z =new ArrayList<>();
    for (int i=0; i<girls.size(); i++)
    {
      z.add(girls.get(i));
      z.add(boys.get(i));
    }

    return z;
  }
}