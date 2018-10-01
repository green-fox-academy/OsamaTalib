package com.greenfox.rescontroller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

  @GetMapping ("/")
  public String Show (){
    return "index.html";
  }
}
