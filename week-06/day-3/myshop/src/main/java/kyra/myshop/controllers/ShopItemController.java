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

  public List<ShopItem> getItems() {
    return items;
  }

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

  @GetMapping("/only-available")
  public String getOnlyAvailableItems(Model model) {
    List<ShopItem> onlyAvailableItems =
        items.stream().filter(shopItem -> shopItem.getQuantityOfStock() > 0).collect(
            Collectors.toList());
    model.addAttribute("items", onlyAvailableItems);
    return "shop";
  }

  @GetMapping("/cheapest-first")
  public String getCheapestFirst(Model model) {
    List<ShopItem> cheapestFirstItems =
        items.stream().sorted(Comparator.comparingInt(ShopItem::getPrice)).collect(
            Collectors.toList());
    model.addAttribute("items", cheapestFirstItems);
    return "shop";
  }

  @GetMapping("/contains-nike")
  public String getNikeItems(Model model) {
    model.addAttribute("items", items.stream()
        .filter(item -> item.getDescription().contains("Nike")).collect(Collectors.toList()));
    return "shop";
  }

  @GetMapping("/average-stock")
  public String getAverageStock(Model model) {
    model.addAttribute("averageStock",
        items.stream().mapToInt(ShopItem::getQuantityOfStock).average().getAsDouble());
    return "average-stock";
  }

  @GetMapping("/most-expensive-available")
  public String getMostExpensiveItem(Model model) {
    model.addAttribute("mostExpensiveItem",
        items.stream().max(Comparator.comparingInt(ShopItem::getPrice)).get().getName());
    return "most-expensive-item";
  }
}
