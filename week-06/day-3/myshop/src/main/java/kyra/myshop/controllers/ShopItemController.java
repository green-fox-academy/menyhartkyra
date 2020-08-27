package kyra.myshop.controllers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import kyra.myshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopItemController {
  List<ShopItem> items;

  public ShopItemController() {
    items = new ArrayList<>();
    items.add(new ShopItem("Running shoes", "Nike running shoes for everyday sport", 1000, 5));
    items.add(new ShopItem("Printer", "some HP printer that will print pages", 3000, 2));
    items.add(new ShopItem("Coca cola", "0.5l standard coke", 25, 0));
    items.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
    items.add(new ShopItem("T-shirt", "Blur with a corgi on a bike", 300, 1));
  }

  @GetMapping("")
  public String getItems(Model model) {
//    model.addAttribute("food", food);
    model.addAttribute("items", items);
    return "shop";
  }

  @GetMapping("/onlyavailable")
  public String getOnlyAvailableItems(Model model) {
    List<ShopItem> onlyAvailableItems =
        items.stream().filter(shopItem -> shopItem.getQuantityOfStock() > 0).collect(
            Collectors.toList());
    model.addAttribute("items", onlyAvailableItems);
    return "shop";
  }

  @GetMapping("/cheapestfirst")
  public String getCheapestFirst(Model model) {
    List<ShopItem> cheapestFirstItems =
        items.stream().sorted(Comparator.comparingInt(ShopItem::getPrice)).collect(
            Collectors.toList());
    model.addAttribute("items", cheapestFirstItems);
    return "shop";
  }

  @GetMapping("/containsnike")
  public String getNikeItems(Model model) {
    model.addAttribute("items", items.stream()
        .filter(item -> item.getDescription().contains("Nike")).collect(Collectors.toList()));
    return "shop";
  }
}
