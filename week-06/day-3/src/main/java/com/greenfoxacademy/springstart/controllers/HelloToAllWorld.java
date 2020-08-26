package com.greenfoxacademy.springstart.controllers;

import java.awt.Color;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloToAllWorld {
  String[] hellos;

  public HelloToAllWorld() {
    hellos = new String[] {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
        "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou",
        "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn",
        "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa",
        "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua",
        "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam",
        "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  }

  @RequestMapping(path = "/web/greetingtoall")
  public String greeting(@RequestParam int newFontsize, @RequestParam String newColor,
                         Model model) {
    model.addAttribute("color", newColor);
    model.addAttribute("fontsize", newFontsize);
    String someHello = hellos[generateRandomNumberBetween(0,hellos.length-1)];
    model.addAttribute("hello",someHello);
    return "greetingtoall";
  }

  public int generateRandomNumberBetween(int min, int max) {
    int interval = max - min + 1;
    return (int) (min + (Math.random() * interval));
  }
}
