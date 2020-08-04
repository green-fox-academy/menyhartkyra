package greenfoxinheritance;

import greenfoxinheritance.enums.Levels;

public class Mentor extends Person {
  private Levels level;

  //region getters setters
  public Levels getLevel() {
    return level;
  }

  public void setLevel(Levels level) {
    this.level = level;
  }
  //endregion

  public Mentor(String name, int age, String gender, Levels level) {
    setName(name);
    setAge(age);
    setGender(gender);
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
