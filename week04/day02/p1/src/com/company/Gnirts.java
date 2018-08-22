package com.company;

public class Gnirts implements CharSequence {
  String word;
  String requiredChar = "";


  Gnirts(String word) {
    this.word = word;
  }

  @Override
  public int length() {
    return word.length();
  }

  @Override
  public char charAt(int index) {
    int start=0;
    int end = length()-1;


    return subSequence(start,end).charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    for (int i = start; i <=end; i++) {
      requiredChar += word.charAt(length() - 1 - i);

  }
  return requiredChar;
}
}

