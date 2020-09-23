package gfa.orientation.exampleexam.controller;

import gfa.orientation.exampleexam.model.Url;
import gfa.orientation.exampleexam.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UrlController {
  private UrlService urlService;

  @Autowired
  public UrlController(UrlService urlService) {
    this.urlService = urlService;
  }

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String renderMainPage() {
    return "main";
  }

  @RequestMapping(path = "/save-link", method = RequestMethod.POST)
  public String saveLink(String urlAddress, String alias, RedirectAttributes redirectAttrs) {
    if (urlService.isAliasSaved(alias)) {
      redirectAttrs.addFlashAttribute("urlPlaceholder", urlAddress);
      redirectAttrs.addFlashAttribute("aliasPlaceholder", alias);
      redirectAttrs.addFlashAttribute("errorMessage", "Your alias is already in use.");
      return "redirect:/";
    }
    Url url = new Url(urlAddress, alias);
    urlService.saveUrl(url);
    redirectAttrs.addFlashAttribute("message",
        "Your URL is aliased to " + url.getAlias() + " and your secret code is " +
            url.getSecretCode() + ".");
    return "redirect:/";
  }
}
