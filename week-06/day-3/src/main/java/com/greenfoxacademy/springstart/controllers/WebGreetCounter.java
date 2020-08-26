package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebGreetCounter {
  AtomicLong id;

  public WebGreetCounter() {
    id = new AtomicLong();
  }

  @RequestMapping(path = "/web/greetings")
  @ResponseBody
  public String greeting(@RequestParam String name) {
    return "Hello, " + name + "! This site was loaded " + id.incrementAndGet() +
        " times since last server start.";
  }
}
