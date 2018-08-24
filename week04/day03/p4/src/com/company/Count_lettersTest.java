package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Count_lettersTest {

  String word = "Osaaa";

  @Test
  public void Check (){
    Count_letters obj = new Count_letters();
   Assert.assertEquals((Integer) 3, obj.check(word).get("a"));
  }

}