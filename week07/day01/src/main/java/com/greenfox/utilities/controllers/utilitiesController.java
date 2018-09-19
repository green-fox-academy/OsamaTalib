package com.greenfox.utilities.controllers;

import com.greenfox.utilities.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Generated;

@Controller
public class utilitiesController {
  UtilityService utilityService;

  @Autowired
  public utilitiesController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  protected String usefulLinks(){

    return "useful-utilities";
  }
}
