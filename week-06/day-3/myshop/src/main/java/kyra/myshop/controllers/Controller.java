package kyra.myshop.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {

  @RequestMapping("")
  public String showItems(){
    return "shop";
  }

  /*@RequestMapping(value = "/search", method = POST)
  public String search(){
    return "redirect:";
  }*/
}
