package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Count_letters {
  String word;


  public HashMap<String, Integer> check(String word) {
    this.word = word;
    HashMap<String, Integer> wordMap = new HashMap<>();
    ArrayList<String> x = new ArrayList<>();
    String[] word2 = word.split("");
    for (int z = 0; z < word2.length; z++) {
      x.add(word2[z]);
    }

    for (int i = 0; i < x.size(); ) {
      int sum = 0;
      for (int j = i + 1; j < x.size(); j++) {
        if (x.get(i).equals(x.get(j))) {
          sum++;
          x.remove(j);

        } else i++;
      }
      sum++;
      wordMap.put(x.get(i), sum);
    }

    return wordMap;
  }
}
