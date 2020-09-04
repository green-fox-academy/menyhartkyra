package programmer.fox.club.demo.model;

public class Food {
  private String name;

  public String getName() {
    return name;
  }

  public Food(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
