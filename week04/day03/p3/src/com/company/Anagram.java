package com.company;

import java.lang.reflect.Array;

public class Anagram {
  String word1;
  String word2;


  public boolean anagOrNot(String word1, String word2) {
    this.word1=word1;
    this.word2=word2;
    String [] word3 = word1.split("");
    int sum= 0;
    for (int i =0; i<word3.length; i++){
      if (word2.contains(word3[i])){
        sum++;
      }
    }
    if (sum == word3.length){
      return true;}
      else {
      return false;
    }
  }
}
