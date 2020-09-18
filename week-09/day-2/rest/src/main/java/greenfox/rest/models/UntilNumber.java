package greenfox.rest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UntilNumber {
  private int until;

  public UntilNumber(int until) {
    this.until = until;
  }

  @Override
  public String toString() {
    return "{\"until\"=\"" + until + "\"}";
  }
}
