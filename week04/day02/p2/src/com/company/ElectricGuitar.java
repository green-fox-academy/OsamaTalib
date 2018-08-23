package com.company;

public class ElectricGuitar extends StringedInstrument {

  ElectricGuitar (int numberOfStrings1){
    this.numberOfStrings1=numberOfStrings1;
  }

  @Override
  public void sound() {

    System.out.println(name1+", a "+ numberOfStrings1+ "-stringed instrument that goes Twang");
  }
}