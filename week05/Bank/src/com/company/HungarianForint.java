package com.company;

public class HungarianForint extends Currency {
  // Create a HungarianForint class that inherits from the Currency.
// Create a constructor that accepts the value.
// The code should be "HUF"
// and the central bank name should be "Hungarian National Bank
  public HungarianForint(int value){
    super(value);
    this.centralBankName= "Hungarian National Bank";
    this.code="HUF";
  }
}
