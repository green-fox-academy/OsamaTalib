package com.company;

public class Animal {

  int hunger = 50;
  int thirst = 50;

  void can_eat() {

    hunger--;
  }

  void can_drink() {
    thirst--;
  }

  void can_play() {
    thirst--;
    hunger--;
  }
}
