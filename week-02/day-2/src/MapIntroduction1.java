import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIntroduction1 {
  public static void main(String[] args) {
    HashMap<Integer, Character> map = new HashMap<>();
    System.out.println(map.isEmpty());
    map.put(97, 'a');
    map.put(98, 'b');
    map.put(99, 'c');
    map.put(65, 'A');
    map.put(66, 'B');
    map.put(67, 'C');

    //Print all the keys
    System.out.println("Keys: " + map.keySet());
    Set<Map.Entry<Integer, Character>> set = map.entrySet();
    Iterator<Map.Entry<Integer, Character>> iterator = set.iterator();
    //Collection<String > collection = new ArrayList<>();
    //Collection<String > collection1 = new HashSet<>();
    //HashMap<String, Integer> map = new Collection<>()

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    //Print all the values
    System.out.println("Values: " + map.values());
    //Add value D with the key 68
    map.put(68, 'D');
    //Print how many key-value pairs are in the map
    System.out.println("Number of pairs: " + map.size());
    //Print the value that is associated with key 99
    System.out.println("value that is associated with key 99: " + map.get(99));
    //Remove the key-value pair where with key 97
    //Print whether there is an associated value with key 100 or not
    System.out.println(map.containsKey(100));
    //Remove all the key-value pairs
    map.clear();
    System.out.println(map);
  }
}
