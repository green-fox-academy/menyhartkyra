package programmer.fox.club.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import programmer.fox.club.demo.model.Fox;

@Controller
public class MainController {
  List<Fox> foxes;

  public MainController(){
    foxes = new ArrayList<>();
  }

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String getMainInfo(Model model, @RequestParam(required = false, defaultValue = "Mr. Fox") String name){
    model.addAttribute("petName", name);
    return "index";
  }

  @RequestMapping(path = "/login", method = RequestMethod.GET)
  public String loginPage(){
    return "login";
  }

  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String getPetName(@RequestParam String petName ){
    Fox fox = new Fox(petName);
    foxes.add(fox);
    return "redirect:/?name=" + petName;
  }
}
