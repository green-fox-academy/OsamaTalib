package com.greenfox.utilities.controllers;

import com.greenfox.utilities.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class utilitiesController {
  UtilityService utilityService;

  @Autowired
  public utilitiesController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String usefulLinks() {

    return "useful-utilities";
  }

  @GetMapping("/useful/colored")
  public String randomColor(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "useful-Color";
  }
}
