package com.company;

public class Bank {

  int allmoney;

  public void createAccount(BankAccount janeAcc) {
    allmoney += janeAcc.getValue();
  }

  public int getAllMoney() {

    return allmoney;
  }
}
