package com.greenfox.rescontroller.model;

import org.springframework.stereotype.Component;

@Component
public class NumberDoubling {

private Integer received;
private Integer result;

  public NumberDoubling() {
  }

  public NumberDoubling(Integer received, Integer result) {
    this.received = received;
    this.result = result;
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
