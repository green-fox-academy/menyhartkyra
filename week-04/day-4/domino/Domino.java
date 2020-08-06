package domino;

public class Domino implements Printable {
  private int rightSide;
  private int leftSide;

  public Domino(int leftSide, int rightSide){
    this.leftSide = leftSide;
    this.rightSide = rightSide;
  }

  public int getLeftSide() {
    return leftSide;
  }

  public int getRightSide() {
    return rightSide;
  }

  @Override
  public void printAllFields() {
    System.out.println("Domino A side: " + getLeftSide() + ", B side: " + getRightSide());
  }
}
