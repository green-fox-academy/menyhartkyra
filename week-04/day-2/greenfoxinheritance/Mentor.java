package greenfoxinheritance;

import greenfoxinheritance.enums.Levels;

public class Mentor extends Person {
  private Levels level;

  public Levels getLevel() {
    return level;
  }

  public Mentor(String name, int age, String gender, Levels level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    level = Levels.INTERMEDIATE;
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm " + getName() + " , a " + getAge() + " year old " + getGender() + " " +
            getLevel().toString().toLowerCase() + " mentor.");
  }
}
