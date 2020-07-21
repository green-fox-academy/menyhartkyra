import java.util.ArrayList;
import java.util.Iterator;

public class ListIntroduction1 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    System.out.println(names.size());
    names.add("William");
    System.out.println(names.isEmpty());
    names.add("John");
    names.add("Amanda");
    System.out.println(names.size());
    System.out.println(names.get(2));
    for (String name : names) {
      System.out.println(names.indexOf(name) + 1 + ". " + name);
    }
    Iterator<String> name = names.iterator();
    System.out.println("Iterator:");
    while (name.hasNext()) {
      System.out.println(name.next());
    }
    names.remove(1);
    System.out.println("Reversed:");
    for (int i = names.size() - 1; i >= 0; i--) {
      System.out.println(names.get(i));
    }
    names.clear();
    System.out.println(names);

  }
}
