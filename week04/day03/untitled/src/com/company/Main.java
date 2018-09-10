package com.company;

interface GreenFox {
  String writeCods(String text);
}

interface Osama extends GreenFox {
  void sizeDoseNotMatter(String writeCods, String Text);
}

abstract class Dave implements Osama {
  public String writeCods(String Text) {
    return Text;
  }
}

class Niteesh extends Dave {
  @Override
  public void sizeDoseNotMatter(String writeCods, String Text) {
    System.out.println(writeCods + " " + Text);
  }
}

public class Main {
  public static void main(String[] args) {
    Dave Obj = new Niteesh();
    Obj.sizeDoseNotMatter(Obj.writeCods("The Size is"), "3 Sm");
  }
}
