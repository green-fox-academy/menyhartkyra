package programmer.fox.club.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  String petName;

  @RequestMapping(path = "/")
  public String getMainInfo(){
    return "index";
  }

  @RequestMapping(path = "/login", method = RequestMethod.GET)
  public String loginPage(){
    return "login";
  }

  @RequestMapping(path = "login", method = RequestMethod.POST)
  public String getPetName(@RequestParam String petName, Model model){
    this.petName = petName;
    model.addAttribute("petName",petName);
    return "index";
  }
}
