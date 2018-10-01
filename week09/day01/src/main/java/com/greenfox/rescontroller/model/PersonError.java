package com.greenfox.rescontroller.model;

import org.springframework.stereotype.Component;

@Component
public class PersonError {

  private String error;

  public PersonError() {
  }

  public PersonError(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = "Please provide a "+ error+ "!";
  }
}
