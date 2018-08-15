package com.company;

public class Main {

  public static void main(String[] args) {
    DiceSet diceSet = new DiceSet();
    diceSet.getCurrent();
    diceSet.roll();
    diceSet.getCurrent();
    for(int k =0; k<6;k++){
    diceSet.getCurrent(k);}
    for (int y : diceSet.getCurrent()){
      System.out.println(y);
    }

  }
}
