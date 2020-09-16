package greenfox.rest.models;

import lombok.Getter;

@Getter
public class UntilNumber {
  private int until;

  @Override
  public String toString() {
    return "{\"until\"=\"" + until + "\"}";
  }
}
