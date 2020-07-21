import java.util.HashMap;

public class TelephoneBook {
  public static void main(String[] args) {
    HashMap<String, String> book = new HashMap<>();
    book.put("William A. Lathan", "405-709-1865");
    book.put("John K. Miller", "402-247-8568");
    book.put("Hortensia E. Foster", "606-481-6467");
    book.put("Amanda D. Newland", "319-243-5613");
    book.put("Brooke P. Askew", "307-687-2982");

    app(book);
  }

  //Create an application which solves the following problems.
  //What is John K. Miller's phone number?
  //Whose phone number is 307-687-2982?
  //Do we know Chris E. Myers' phone number?
  public static void app(HashMap<String, String> book) {
    System.out.println("John Miller's phone number: " + book.get("John K. Miller"));
    String key = "";
    for (String i : book.keySet()) {
      if (book.get(i).equals("307-687-2982")) {
        key = i;
      }
    }
    System.out.println("307-687-2982 belong to " + key);
    System.out.println(book.containsKey("Chris E. Myers"));
  }
}
