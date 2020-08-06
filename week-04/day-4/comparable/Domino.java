package comparable;

import java.util.Arrays;

public class Domino implements Comparable<Domino>{
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  @Override
  public int compareTo(Domino domino) {
    int result = Integer.compare(this.getLeftSide(), domino.getLeftSide());
    if (result == 0){
      result = Integer.compare(this.getRightSide(), domino.getRightSide());
    }
    return result;
  }
}