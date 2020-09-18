package greenfox.rest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoUntil {
  private int result;

  public DoUntil(int result) {
    this.result = result;
  }
}