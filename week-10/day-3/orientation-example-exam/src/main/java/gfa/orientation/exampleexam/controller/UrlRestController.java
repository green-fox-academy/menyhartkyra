package gfa.orientation.exampleexam.controller;

import gfa.orientation.exampleexam.model.Url;
import gfa.orientation.exampleexam.service.UrlService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlRestController {
  private UrlService urlService;

  @Autowired
  public UrlRestController(UrlService urlService) {
    this.urlService = urlService;
  }

  @RequestMapping(path = "/api/links", method = RequestMethod.GET)
  public List<Url> showEntries(){
    return urlService.getUrls();
  }
}
