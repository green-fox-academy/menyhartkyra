import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
  public static void main(String[] args) {
    //We are going to represent a shopping list in a list containing strings.

    //Create a list with the following items.
    String[] listArray = new String[] {"eggs", "milk", "fish", "apples", "bread", "chicken"};
    ArrayList<String> list = new ArrayList<>();
    list.addAll(Arrays.asList(listArray));
    System.out.println(list);
    app(list);
  }

  //Create an application which solves the following problems.
  //Do we have milk on the list?
  //Do we have bananas on the list?
  public static void app(ArrayList<String> list) {
    System.out.println("milk? " + list.contains("milk"));
    System.out.println("bananas? " + list.contains("banana"));
  }
}
