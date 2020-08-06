package greenfoxinheritance;

public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  //region getters setters
  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }
  //endregion

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm " + getName() + " , a " + getAge() + " year old " + getGender() +
            " from " + getPreviousOrganization() + ", who skipped " + getSkippedDays() +
            " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    setSkippedDays(getSkippedDays() + numberOfDays);
  }
}
