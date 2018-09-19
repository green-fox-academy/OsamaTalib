package com.greenfox.printer;

import org.springframework.stereotype.Service;

@Service
public class PrintColor implements MyColor {

  @Override
  public void printColor(String color) {
    System.out.println("This color is "+ color);
  }
}
