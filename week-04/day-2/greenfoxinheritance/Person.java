package greenfoxinheritance;

public class Person {
  private String name;
  private int age;
  private String gender;

  public String getName() {
    return name;
  }

  //region getters setters
  protected void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
  //endregion

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}
