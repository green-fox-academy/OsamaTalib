package com.greenfoxacademy.bankofsimba.controllers;


import com.greenfoxacademy.bankofsimba.model.Bank;
import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;


@Controller
public class BankController {

  @GetMapping("")
  public String showBankProfile(Model model) {

    Bank bank = new Bank(Arrays.asList(
        new BankAccount("Simba", 2000, "lion",true, true)
        , new BankAccount("Nala", 10000, "african alion",false, true)
        , new BankAccount("Zazu", 70, "red-billed hornbill",false, true)
        , new BankAccount("Timon", 115, "meerkat",false, true)
        , new BankAccount("Zira", 7000, "african lion",true, false)
        , new BankAccount("Pumbaa", 210, "common warthog",false, true)));
    model.addAttribute("Bank", bank.getNewBankAccounts());
    return "Bank-profile";
  }

  @GetMapping("/show")
  public String addTextToTheProfile(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("Text", text);
    return "redirect:";
  }
}
