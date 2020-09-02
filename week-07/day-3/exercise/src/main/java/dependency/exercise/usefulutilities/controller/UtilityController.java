package dependency.exercise.usefulutilities.controller;

import dependency.exercise.usefulutilities.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UtilityController {
  UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService){
    this.utilityService = utilityService;
  }

  @RequestMapping(path = "/useful", method = RequestMethod.GET)
  public String getMainPage() {
    return "main";
  }

  @RequestMapping(path = "/useful/colored")
  public String pageWithRandomColourBackground(Model model) {
    model.addAttribute("randomColour",utilityService.randomColor());
    return "randomcolour";
  }

  @RequestMapping(path = "/useful/email")
  public String validateEmail(@RequestParam(required = false) String email){
    String isEmailValid = utilityService.validateEmail(email);
    return "main";
  }
}