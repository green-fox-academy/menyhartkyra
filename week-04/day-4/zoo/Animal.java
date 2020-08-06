package zoo;

public abstract class Animal {
  String name;
  int age;
  String gender;

  public String getName() {
    return name;
  }
  abstract String breed();

}
