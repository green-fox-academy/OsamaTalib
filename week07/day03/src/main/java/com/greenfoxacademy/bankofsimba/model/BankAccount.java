package com.greenfoxacademy.bankofsimba.model;


import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {

  String name;
  String balance;
  int aIntBalance;
  String animalType;
  long id = 1;
  static AtomicLong incrementedId = new AtomicLong(0);
  boolean isItKing;
  boolean isItGoodGuy;

  public BankAccount() {
  }

  public BankAccount(String name, int balance, String animalType, boolean isItKing, boolean isItGoodGuy) {
    this.name = name;
    this.balance = String.format("%.2f", (float) balance) + " zebra";
    this.aIntBalance=balance;
    this.animalType = animalType;
    this.id = incrementedId.incrementAndGet();
    this.isItKing = isItKing;
    this.isItGoodGuy = isItGoodGuy;
  }

  public boolean isItKing() {
    return isItKing;
  }

  public void setItKing(boolean isItKing) {
    this.isItKing = isItKing;
  }

  public boolean isItGoodGuy() {
    return isItGoodGuy;
  }

  public void setItGoodGuy(boolean isItGoodGuy) {
    this.isItGoodGuy = isItGoodGuy;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {

    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = String.format("%.2f", (float) balance) + " zebra";
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public int getaIntBalance() {
    return aIntBalance;
  }

  public void setaIntBalance(int aIntBalance) {
    this.aIntBalance = aIntBalance;
  }
}
