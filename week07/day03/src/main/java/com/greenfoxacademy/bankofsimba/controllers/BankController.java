package com.greenfoxacademy.bankofsimba.controllers;


import com.greenfoxacademy.bankofsimba.model.Bank;
import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;


@Controller
public class BankController {
  Bank bank = new Bank(Arrays.asList(
      new BankAccount("Simba", 2000, "lion",true, true)
      , new BankAccount("Nala", 10000, "african alion",false, true)
      , new BankAccount("Zazu", 70, "red-billed hornbill",false, true)
      , new BankAccount("Timon", 115, "meerkat",false, true)
      , new BankAccount("Zira", 7000, "african lion",true, false)
      , new BankAccount("Pumbaa", 210, "common warthog",false, true)));
  @GetMapping("/show")
  public String showBankProfile(Model model) {
    model.addAttribute("Bank", bank.getNewBankAccounts());
    return "Bank-profile";
  }
  @GetMapping("/")
  public String welcome(){
    return "welcome";
  }
  @PostMapping("/show/")
  public String giveDonate(@ModelAttribute(value = "character_name") String name, @ModelAttribute(value = "donate") int donate) {
    for (int i = 0; i < bank.getNewBankAccounts().size(); i++) {
      if (bank.getNewBankAccounts().get(i).getName().equals(name))
        bank.getNewBankAccounts().get(i).setBalance(bank.getNewBankAccounts().get(i).getaIntBalance() + donate);
    }
    return "redirect:/show";
  }

}
