package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
  String word = "Apple";

  @Test
  public void getApple( ) {
    Apple test = new Apple();
    Assert.assertEquals("Apple",test.getApple(word));

  }
}