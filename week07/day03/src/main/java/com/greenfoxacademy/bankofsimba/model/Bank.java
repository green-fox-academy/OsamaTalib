package com.greenfoxacademy.bankofsimba.model;

import java.util.List;

public class Bank {
  List<BankAccount> newBankAccounts ;

  public Bank() {
  }

  public Bank(List<BankAccount> newBankAccounts) {
    this.newBankAccounts = newBankAccounts;
  }

  public List<BankAccount> getNewBankAccounts() {
    return newBankAccounts;
  }

  public void setNewBankAccounts(List<BankAccount> newBankAccounts) {
    this.newBankAccounts = newBankAccounts;
  }
}
