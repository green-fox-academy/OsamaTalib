package com.company;

import java.util.ArrayList;

public class Cohort {
  String name;
  ArrayList<Student> Students;
  ArrayList<Mentor> Mentors;

  public Cohort(String name) {

    Students = new ArrayList<>();
    Mentors = new ArrayList<>();
    this.name = name;
  }

  public void addStudent(Student Osama) {
    Students.add(Osama);
  }

  public void addMentor(Mentor Barni) {
    Mentors.add(Barni);
  }

  public void info() {
    System.out.println("The " + name + " cohort has " + Students.size() + " " + " students and " + Mentors.size() + " mentors .");
  }
}
