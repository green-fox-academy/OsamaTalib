package com.company;

public class Sharpie {
  String color;
  float width;
  float inkAmount = 100;
  void Sharpie (String color, float width){

    this.color=color;
    this.width=width;
  }
  void use(){
    System.out.println(inkAmount);
  }
}
