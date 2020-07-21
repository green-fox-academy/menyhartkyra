import java.util.ArrayList;
import java.util.HashMap;

public class ProductDatabase2 {
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

  //Which products cost less than 201? (just the name)
  //Which products cost more than 150? (name + price)
  public static void app(HashMap<String, Integer> database) {
    ArrayList<String> LessThan201 = new ArrayList<>();
    for (String key : database.keySet()) {
      if (database.get(key) < 201) {
        LessThan201.add(key);
      }

    }
    System.out.println("Less than 201: " + LessThan201);
    System.out.println("More than 150: ");
    for (String key : database.keySet()) {
      if (database.get(key) > 150) {
        System.out.print(key + ": " + database.get(key) + "  ");
      }
    }


  }
}