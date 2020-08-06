package charsequence;

public class Gnirts implements CharSequence {
  private String field;
  private StringBuilder stringBuilder;

  public Gnirts(String field) {
    stringBuilder = new StringBuilder();
    stringBuilder.append(field);
    stringBuilder = stringBuilder.reverse();
  }

  @Override
  public int length() {
    return field.length();
  }

  @Override
  public char charAt(int i) {
    return stringBuilder.charAt(i);
  }

  @Override
  public CharSequence subSequence(int i, int i1) {
    return stringBuilder.subSequence(i,i1);
  }
}
