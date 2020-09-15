package greenfox.rest.models;

import lombok.Getter;

@Getter
public class ArrayResult {
  private int[] result;

  public ArrayResult(int[] result) {
    this.result = result;
  }
}
