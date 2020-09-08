package com.greenfox.controller
    ;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebGreetCounter {
  AtomicLong id;

  public WebGreetCounter() {
    id = new AtomicLong();
  }

  @RequestMapping(path = "/")
  @ResponseBody
  public String greeting() {
    return "Hello, visitor! This site was loaded " + id.incrementAndGet() +
        " times since last server start.";
  }
}
