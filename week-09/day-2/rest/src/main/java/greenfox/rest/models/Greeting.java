package greenfox.rest.models;

public class Greeting {
  private String welcome_message;

  public Greeting(String name, String title) {
    welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }
}
