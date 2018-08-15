package com.company;

public class BlogPost {

  String authorName;
  String title;
  String text;
  String publicationDate;

  void BlogPost(String authorName,String title, String text, String publicationDate){
    this.authorName=authorName;
    this.publicationDate=publicationDate;
    this.text=text;
    this.title=title;

    System.out.println("\""+title+"\" "+ "titled by "+ authorName + " posted at "+ publicationDate);
    System.out.println(text);


  }
}
