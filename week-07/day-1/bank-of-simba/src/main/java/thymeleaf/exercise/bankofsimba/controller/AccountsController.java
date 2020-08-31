package thymeleaf.exercise.bankofsimba.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import thymeleaf.exercise.bankofsimba.model.BankAccount;

@Controller
public class AccountsController {
  List<BankAccount> accounts;

  public AccountsController() {
    accounts = new ArrayList<>();
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showAccount(Model model) {
    BankAccount account1 = new BankAccount("Simba", 2000, "lion");
    accounts.add(account1);
    model.addAttribute("name", account1.getName());
    model.addAttribute("balance", account1.getBalance());
    model.addAttribute("animalType", account1.getAnimaltype());
    return "show";
  }

  @RequestMapping(path = "/htmlception")
  public String displayString(Model model) {
    model.addAttribute("htmlstring", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "show";
  }
}
