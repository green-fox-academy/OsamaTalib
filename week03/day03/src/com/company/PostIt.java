package com.company;

public class PostIt {
  String backgroundColor;
  String text;
  String textColor;

  void Mode(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
    System.out.println("The background Color is " + backgroundColor + " The text is " + text + " The text color is " + textColor);
  }

}
