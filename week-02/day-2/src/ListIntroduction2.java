import java.util.ArrayList;

public class ListIntroduction2 {
  public static void main(String[] args) {
    //Create a list ('List A') which contains the following values
    //    Apple, Avocado, Blueberries, Durian, Lychee
    ArrayList<String> listA = new ArrayList<>();
    listA.add("Apple");
    listA.add("Avocado");
    listA.add("Blueberries");
    listA.add("Durian");
    listA.add("Lychee");
    //Create a new list ('List B') with the values of List A
    ArrayList<String> listB = new ArrayList<>();
    listB.addAll(listA);
    System.out.println("List B: " + listB);
    System.out.println("Print out whether List A contains Durian: " + listA.contains("Durian"));
    //Remove Durian from List B
    listB.remove("Durian");
    System.out.println("List B: " + listB);
    System.out.println("Add Kiwifruit to List A after the 4th element");
    listA.add(4, "Kiwifruit");
    System.out.println("List A: " + listA);
    System.out.println("Compare the size of List A and List B:");
    System.out.println("List A elemszáma: " + listA.size() + "  List B elemszáma: " + listB.size());
    System.out.println("index of Avocado from List A: " + listA.indexOf("Avocado"));
    System.out.println("index of Durian from List B: " + listB.indexOf("Durian"));
    //Add Passion Fruit and Pomelo to List B in a single statement
    ArrayList<String> listC = new ArrayList<>();
    listC.add("Passon Fruit");
    listC.add("Pomelo");
    listB.addAll(listC);
    System.out.println("List B: " + listB);
    System.out.println("Print out the 3rd element from List A: " + listA.get(2));
  }
}
