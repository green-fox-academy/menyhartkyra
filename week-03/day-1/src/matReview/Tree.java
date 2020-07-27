package matReview;

public class Tree {
  private String type;
  private String sex;
  private String leafColor;
  private int age;

  public Tree(String type, String sex, String leafColor) {
    this(type, sex, leafColor, 0);
  }

  public Tree(String type, String sex, String leafColor, int age) {
    this.type = type;
    this.leafColor = leafColor;
    this.sex = sex;
    this.age = age;
  }

  public void grow() {
    ++this.age;
  }

  public String getType() {    // azért kell mert private a type
    return type;
  }

  public String getSex() {
    return sex;
  }

  public String getLeafColor() {
    return leafColor;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    }
  }

}
