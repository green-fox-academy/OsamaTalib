package com.greenfoxacademy.shelterapp.controllers;

import com.greenfoxacademy.shelterapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  PersonRepository personRepository;

  @Autowired
  public UserController(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @GetMapping("/profile")
  public String showUserProfile(Model model) {
    model.addAttribute("user", personRepository.findById(13L).get());
    return "user-profile";
  }

}