package programmer.fox.club.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import programmer.fox.club.demo.model.Fox;
import programmer.fox.club.demo.services.FoxService;

@Controller
public class MainController {
  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String getMainInfo(Model model, @RequestParam(required = false) String name) {
    if (name == null) {
      return "redirect:/login";
    }
    model.addAttribute("pet", foxService.getFox(name));
    return "index";
  }

  @RequestMapping(path = "/login", method = RequestMethod.GET)
  public String renderLoginPage() {
    return "login";
  }

  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String addFox(@RequestParam String petName) {
    foxService.addFox(petName);
    return "redirect:/?name=" + petName;
  }

  @RequestMapping(path = "/nutrition-store", method = RequestMethod.GET)
  public String renderNutritionStore(@RequestParam(required = false) String name){
    if (name == null) {
      return "redirect:/login";
    }
    return "nutrition-store";
  }

}
