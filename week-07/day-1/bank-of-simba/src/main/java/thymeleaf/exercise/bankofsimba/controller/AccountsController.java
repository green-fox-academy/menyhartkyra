package thymeleaf.exercise.bankofsimba.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import thymeleaf.exercise.bankofsimba.model.BankAccount;
import thymeleaf.exercise.bankofsimba.service.AccountService;

@Controller
public class AccountsController {
  private AccountService accountService;

  @Autowired
  public AccountsController(AccountService accountService) {
    this.accountService = accountService;
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showAccount(Model model) {
    BankAccount account1 = accountService.getAllAccounts().get(0);
    model.addAttribute("name",account1.getName());
    model.addAttribute("balance",account1.getBalance());
    model.addAttribute("animalType",account1.getAnimaltype());
    return "show";
  }

  @RequestMapping(path = "/accounts", method = RequestMethod.GET)
  public String showAccounts(Model model){
    model.addAttribute("accounts", accountService.getAllAccounts());
    return "accounts";
  }

  @RequestMapping(path = "/htmlception")
  public String displayString(Model model) {
    model.addAttribute("htmlstring", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "show";
  }

  @RequestMapping(path = "/raise-balance")
  public String raiseBalance(Integer accountId){
    BankAccount account = accountService.getAllAccounts().get(accountId);
    if (account.isKing()){
      account.setBalance(account.getBalance()+100);
    } else {
      account.setBalance(account.getBalance()+10);
    }
    return "redirect:/accounts";
  }
}
