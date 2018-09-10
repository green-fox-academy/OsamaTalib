package com.company;

public class BankAccount extends Bank {
  // Create a BankAccount class.
// It should have a name, a pin code and a Currency field.
// Create a constructor for setting those values.
  String name;
  String pinCode;
  int value;
  int code;

  public BankAccount(String name, String pinCode, Currency janeCash) {
    this.name = name;
    this.pinCode = pinCode;

    value += janeCash.getValue();
  }

  public void deposit(int depo) {
if (depo > 0) {
  this.value += depo;

}
// Create a deposit method which check if the given parameter is positive
// then adds the parameter to the Currency's value field.

  }

  public int withdraw(String pinCode, int amount) {
    if (pinCode.equals(this.pinCode) && amount <= value) {
      this.value -= amount;
      return amount;


    } else return 0;
  }

  public int getValue() {

    return value;
  }
  // Create a withdraw method with two parameters: a pin code and an amount.
// It should check if the given pin is correct (equals with the original pin)
// and the Currency's value is more than the amount parameter.
// If so, subtract the amount from the Currency's value and return with the amount.
// Otherwise don't modify the Currency's value and return with 0.
}
