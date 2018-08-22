package com.company;

public class Shifter implements java.lang.CharSequence {
  String word;
  int num;
  String requiredChar = "";

  Shifter(String word, int num) {
    this.word = word;
    this.num = num;
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
  public java.lang.CharSequence subSequence(int start, int end) {
    for (int i = start; i + num <= end; i++) {
      requiredChar += word.charAt(i + num);

    }
    return requiredChar;
  }
}
