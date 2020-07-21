import java.util.HashMap;
import java.util.Set;

public class ProductDatabase {
  public static void main(String[] args) {
    HashMap<String, Integer> database = new HashMap<>();
    database.put("Eggs", 200);
    database.put("Milk", 200);
    database.put("Fish", 400);
    database.put("Apples", 150);
    database.put("Bread", 50);
    database.put("Chicken", 550);
    app(database);
  }
  //Create an application which solves the following problems.

  public static void app(HashMap<String, Integer> database) {
    //How much is the fish?
    System.out.println("Price of fish: " + database.get("Fish"));
    //What is the most expensive product?
    //What is the average price?
    //How many products' price is below 300?
    int expensive = 0;
    String expensiveKey = "";
    int sum = 0;
    int cnt300 = 0;
    for (String key : database.keySet()) {
      if (database.get(key) > expensive) {
        expensive = database.get(key);
        expensiveKey = key;
      }
      sum += database.get(key);
      if (database.get(key) < 300) {
        cnt300++;
      }

    }
    String cheapestKey = expensiveKey;
    int cheapest = expensive;
    for (String key : database.keySet()) {
      if (database.get(key) < cheapest) {
        cheapest = database.get(key);
        cheapestKey = key;
      }
    }
    System.out.println("most expensive product: " + expensiveKey);
    System.out.println("Average price: " + sum / database.size());
    System.out.println("#products' price below 300: " + cnt300);
    System.out
        .println("Is there anything we can buy for exactly 125? " + database.containsValue(125));
    System.out.println("cheapest product? " + cheapestKey);

  }
}
