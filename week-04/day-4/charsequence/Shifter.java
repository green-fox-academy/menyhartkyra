package charsequence;

public class Shifter implements CharSequence {
  private String string;
  private int shiftBy;

  public Shifter(String string, int shiftBy) {
    this.string = string;
    this.shiftBy = shiftBy;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int i) {
    return string.charAt(i+shiftBy);
  }

  @Override
  public CharSequence subSequence(int i, int i1) {
    return string.subSequence(i+shiftBy,i1+shiftBy);
  }
}
