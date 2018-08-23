package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  String word1 = "Osama";
  String word2 = "Osaam";

  @Test
  public void testAng(){
    Anagram test = new Anagram();
    Assert.assertEquals(true , test.anagOrNot(word1,word2));
  }

}