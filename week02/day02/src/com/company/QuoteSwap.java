package com.company;
import java.util.*;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // Create a method called quoteSwap().

    // Also, print the sentence to the output with spaces in between.
    System.out.println(quoteSwap(list));
    // Expected output: "What I cannot create I do not understand."

  }
  public static ArrayList<String> quoteSwap(ArrayList<String>list)
  {
    ArrayList<String> x = new ArrayList<>();
    String y = "";
    String temp = list.get(2);
    list.set(2,list.get(5));
    list.set(5,temp);
    for (int i = 0; i<list.size();i++)
    {
     y = y + list.get(i)+ " " ;

    }
    x.add(y);
    return x;
  }
}
