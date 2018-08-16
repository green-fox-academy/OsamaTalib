package com.company;

import java.util.Scanner;


public class Power {
  static long sum=1;
  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    Scanner scanner = new Scanner(System.in);
    long number = scanner.nextInt();
    long number2 = scanner.nextInt();

    if (number>0 && number2>0){
      System.out.println(compute(number, number2));
    }

  }
  public static long compute(long number , long number2){
    if(number2 == 0){
      return sum;
    }else {

      sum=sum*number;
      return compute(number,number2-1);
    }
  }
}
