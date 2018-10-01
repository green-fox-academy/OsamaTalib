package com.greenfox.rescontroller.model;

import org.springframework.stereotype.Component;

@Component
public class DoublingError {

  private String error = "Please provide an input!";

  public DoublingError() {
  }

  public DoublingError(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
