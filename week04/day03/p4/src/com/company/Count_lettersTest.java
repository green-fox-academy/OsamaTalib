package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Count_lettersTest {

  String word = "Osama";

  @Test
  public void Check (){
    Count_letters obj = new Count_letters();
   Assert.assertEquals((Integer) 2, obj.check(word).get("a"));
  }

}