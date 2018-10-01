package com.greenfox.rescontroller.DoubleServices;

import com.greenfox.rescontroller.model.*;

import org.springframework.stereotype.Service;

@Service
public class Services {

  NumberDoubling numberDoubling;
  DoublingError doublingError;
  Person person;
  PersonError personError;
  Append append;

  public Services(NumberDoubling numberDoubling, DoublingError doublingError, Person person, PersonError personError, Append append) {
    this.numberDoubling = numberDoubling;
    this.doublingError = doublingError;
    this.person = person;
    this.personError = personError;
    this.append = append;
  }

  public Object doublingError() {
    return doublingError;
  }

  public Object Result(Integer input) {
    numberDoubling.setReceived(input);
    numberDoubling.setResult(input * 2);
    return numberDoubling;
  }

  public Object personGreeting(String name, String title) {
    person.setWelcome_message(name, title);
    return person;
  }

  public Object personError(String string) {
    personError.setError(string);
    return personError;
  }

  public Object wordAppend(String string) {
    append.setAppended(string + "a");
    return append;
  }
}
