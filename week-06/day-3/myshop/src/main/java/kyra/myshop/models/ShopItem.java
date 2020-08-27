package kyra.myshop.models;

public class ShopItem {
  String name;
  String description;
  int price;
  int quantityOfStock;

  public ShopItem(String name, String description, int price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }
}
