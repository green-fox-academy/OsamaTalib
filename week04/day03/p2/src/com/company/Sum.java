package com.company;

import java.util.ArrayList;

public class Sum {

  ArrayList<Integer> numbers ;

  public int intSum (ArrayList<Integer> numbers){
    this.numbers=numbers;
    int sum =0;
    for (int  num : numbers ){
      sum +=num;
    }
    return sum;
  }
}
