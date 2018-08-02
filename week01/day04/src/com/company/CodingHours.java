package com.company;

public class CodingHours {
  public static void main(String[] args) {

    double Hours = 6;
    double week = 17;
    double days=5;
    double Average = 52;


    System.out.println("the spending hours per semester by an attendee is = "+ (Hours*week*days));
    System.out.println("the percentage of the coding hours in the semester is = "+ ((Hours*week*days)/(Average*week))*100);


  }
}
