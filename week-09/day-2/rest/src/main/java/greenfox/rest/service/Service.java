package greenfox.rest.service;

import greenfox.rest.models.DoUntil;
import greenfox.rest.models.UntilNumber;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

  public DoUntil calculateResult(String action, UntilNumber untilNumber) {
    int until = untilNumber.getUntil();
    DoUntil doUntil = new DoUntil();
    if (action.equals("sum")) {
      doUntil.setResult(sum(until));
    } else {
      doUntil.setResult(factor(until));
    }
    return doUntil;
  }

  private int sum(int until) {
    int result = 0;
    for (int i = 1; i < until + 1; i++) {
      result += i;
    }
    return result;
  }

  private int factor(int until) {
    int result = 1;
    for (int i = 2; i < until + 1; i++) {
      result *= i;
    }
    return result;
  }
}
