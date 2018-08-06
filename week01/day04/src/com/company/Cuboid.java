package com.company;

public class Cuboid {
  public static void main(String[] args) {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
    double length = 25 ;
    double width = 10;
    double height = 15;
    double surfaceArea = 2*(length*height)+2*(length*width)+2*(height*width);
    double volume =  length*width*height;
    System.out.println("Surface Area: "+surfaceArea);
    System.out.println("Volume: "+volume);
  }
}
