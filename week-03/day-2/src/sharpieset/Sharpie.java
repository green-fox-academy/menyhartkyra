package sharpieset;

public class Sharpie {

  private String color;
  private double width;
  private double inkAmount;

  public double getInkAmount() {
    return inkAmount;
  }

  public void setInkAmount(double inkAmount) {
    this.inkAmount = inkAmount;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Sharpie(String color, double width) {
    this(color, width, 100);
  }

  public Sharpie(String color, double width, double inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public void use() {
    this.inkAmount--;
  }

  public String sharpieToString(Sharpie sharpie) {
    String sharpieString = sharpie.color + " " + sharpie.getWidth() + " " + sharpie.getInkAmount();
    return sharpieString;
  }

  public static void main(String[] args) {
    Sharpie sharpie = new Sharpie("black", 67.5);
    sharpie.use();
    System.out
        .println(sharpie.getColor() + " " + sharpie.getWidth() + " " + sharpie.getInkAmount());
    System.out.println(sharpie.sharpieToString(sharpie));
  }

  @Override
  public String toString() {
    return "color='" + color + '\'' +
        ", width=" + width +
        ", inkAmount=" + inkAmount + "\n";
  }
}
