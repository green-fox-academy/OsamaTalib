package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Sumtest {

  ArrayList<Integer> sum = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
  Sum obj = new Sum();

  @Test
  public void test() {
    Sum obj = new Sum();
    Assert.assertEquals(14, obj.intSum(sum));


  }


}