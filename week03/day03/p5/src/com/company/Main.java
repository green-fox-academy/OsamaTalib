package com.company;

public class Main {

  public static void main(String[] args) {

    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing x = new Thing("Get milk");
    Thing y = new Thing("Remove the obstacles");
    Thing z = new Thing("Stand up");
    z.complete();
    Thing v = new Thing("Eat lunch");
    v.complete();

    fleet.add(x);
    fleet.add(y);
    fleet.add(z);
    fleet.add(v);


    System.out.println(fleet);
  }
}
