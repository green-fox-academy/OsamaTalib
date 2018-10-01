package com.greenfox.rescontroller.model;

import org.springframework.stereotype.Component;

@Component
public class Person {
  private String welcome_message;

  public Person() {
  }

  public Person( String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message (String name , String title ) {

    this.welcome_message = "Oh, hi there " + name+ ", my dear " +title + "!";
  }
}
