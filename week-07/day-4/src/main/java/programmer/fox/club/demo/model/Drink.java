package programmer.fox.club.demo.model;

public class Drink {
  private String name;

  public Drink(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name;
  }
}
