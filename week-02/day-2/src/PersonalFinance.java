import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
  public static void main(String[] args) {
    //We are going to represent our expenses in a list containing integers.

    //Create a list with the following items.
    Integer[] expensesArray = new Integer[] {500, 1000, 1250, 175, 800, 120};
    ArrayList<Integer> expenses = new ArrayList<>();
    expenses.addAll(Arrays.asList(expensesArray));
    System.out.println(expenses);
    app(expenses);
  }

  //Create an application which solves the following problems.
  //How much did we spend?
  //Which was our greatest expense?
  //Which was our cheapest spending?
  //What was the average amount of our spendings?
  public static void app(ArrayList<Integer> expenses) {
    int sum = 0;
    for (int i = 0; i < expenses.size(); ++i) {
      sum += expenses.get(i);
    }
    System.out.println("Ennyit költöttünk: " + sum);
    int legnagyobb = expenses.get(0);
    int cheapest = expenses.get(0);
    for (int i = 1; i < expenses.size(); i++) {
      if (expenses.get(i) > legnagyobb) {
        legnagyobb = expenses.get(i);
      }
      if (expenses.get(i) < cheapest) {
        cheapest = expenses.get(i);
      }
    }
    System.out.println("Legnagyobb költés: " + legnagyobb);
    System.out.println("Cheapest expense: " + cheapest);
    System.out.println("Average spending: " + sum / expenses.size());
  }

}
