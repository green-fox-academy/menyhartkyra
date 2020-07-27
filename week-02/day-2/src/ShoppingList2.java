import java.util.HashMap;

public class ShoppingList2 {
  public static void main(String[] args) {
    HashMap<String, Double> list = new HashMap<>();
    HashMap<String, Double> bob = new HashMap<>();
    HashMap<String, Double> alice = new HashMap<>();

    list.put("Milk", 1.07);
    list.put("Rice", 1.59);
    list.put("Eggs", 3.14);
    list.put("Cheese", 12.60);
    list.put("Chicken Breasts", 9.40);
    list.put("Apples", 2.31);
    list.put("Tomato", 2.58);
    list.put("Potato", 1.75);
    list.put("Onion", 1.10);

    bob.put("Milk", 3.0);
    bob.put("Rice", 2.0);
    bob.put("Eggs", 2.0);
    bob.put("Cheese", 1.0);
    bob.put("Chicken Breasts", 4.0);
    bob.put("Apples", 1.0);
    bob.put("Tomato", 2.0);
    bob.put("Potato", 1.0);

    alice.put("Rice", 1.0);
    alice.put("Eggs", 5.0);
    alice.put("Chicken Breasts", 2.0);
    alice.put("Apples", 1.0);
    alice.put("Tomato", 10.0);

    System.out.println("Bob pays: " + sum(bob));
    System.out.println("Alice pays: " + sum(alice));
    System.out.println(more("Rice", bob, alice) + " buys more Rice");
    System.out.println(more("Potato", bob, alice) + " buys more Potato");

  }

  //How much does Bob pay?
  //How much does Alice pay?

  //Who buys more different products?
  //Who buys more products? (piece)
  public static int sum(HashMap<String, Double> list) {
    int sum = 0;
    for (String key : list.keySet()) {
      sum += list.get(key);
    }
    return sum;
  }

  //Who buys more Rice?
  //Who buys more Potato?
  public static String more(String key, HashMap<String, Double> bob,
                            HashMap<String, Double> alice) {
    double Bob = 0;
    double Alice = 0;
    for (String i : bob.keySet()) {
      if (i.equals(key)) {
        Bob = bob.get(key);
      }
    }
    for (String i : alice.keySet()) {
      if (i.equals(key)) {
        Alice = alice.get(key);
      }
    }
    if (Bob > Alice) {
      return "Bob";
    } else if (Alice > Bob) {
      return "Alice";
    } else {
      return "senki";
    }
  }
}
