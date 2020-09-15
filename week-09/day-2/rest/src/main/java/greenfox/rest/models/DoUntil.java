package greenfox.rest.models;

import greenfox.rest.service.Service;
import lombok.Getter;

@Getter
public class DoUntil {
  private int result;

  public DoUntil(String action, UntilNumber untilNumber) {
    Service service = new Service();
    result = service.calculateResult(action, untilNumber);
  }
}