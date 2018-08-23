package com.company;

public class BassGuitar extends StringedInstrument {

  BassGuitar(int numberOfStrings2){
    this.numberOfStrings2=numberOfStrings2;
  }

  @Override
  public void sound() {
    System.out.println(name2+", a "+ numberOfStrings2+ "-stringed instrument that goes Twang");
  }
}
