import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapIntroduction2 {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("978-1-60309-452-8", "A Letter to Jo");
    map.put("978-1-60309-459-7", "Lupus");
    map.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    map.put("978-1-60309-461-0", "The Lab");
    for (String i : map.keySet()) {
      System.out.println(map.get(i) + " (ISBN: " + i + ")");
    }
    map.remove("978-1-60309-444-3");

    //Remove the key-value pair with value The Lab
    for (String i : map.keySet()) {
      if (map.get(i).equals("The Lab")) {
        map.remove(i);
      }
    }
    System.out.println(map);

    map.put("978-1-60309-450-4", "They Called Us Enemy");
    map.put("978-1-60309-453-5", "Why Did We Trust Him?");

    //Print whether there is an associated value with key 478-0-61159-424-8 or not
    System.out.println(map.containsKey("478-0-61159-424-8"));

    //Print the value associated with key 978-1-60309-453-5
    System.out.println(map.get("978-1-60309-453-5"));
  }
}
