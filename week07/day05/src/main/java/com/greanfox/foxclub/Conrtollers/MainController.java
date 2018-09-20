package com.greanfox.foxclub.Conrtollers;

import com.greanfox.foxclub.modle.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
Fox fox;

@Autowired
  public MainController(Fox fox) {
  this.fox=fox;
  }

  @GetMapping("/login")
  public String ShowLoginPage() {
    return "index";
  }

  @PostMapping("/login")
  public String ReadLoginPage(@ModelAttribute(value = "name") String name) {

    return "redirect:/";
  }

}
