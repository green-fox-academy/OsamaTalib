package com.greenfox.rescontroller.controllers;

import com.greenfox.rescontroller.DoubleServices.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppRestController {

  Services services;

  @Autowired
  public AppRestController(Services services) {
    this.services = services;
  }

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      return services.doublingError();
    } else {
      return services.Result(input);
    }
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return services.personError("name");
    } else if (title == null) {
      return services.personError("title");
    } else {
      return services.personGreeting(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object append(@PathVariable("appendable") String string) {
    return services.wordAppend(string);
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable("action") String string){

    
  }
}
