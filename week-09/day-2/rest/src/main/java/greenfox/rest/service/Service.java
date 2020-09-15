package greenfox.rest.service;

import greenfox.rest.models.UntilNumber;

@org.springframework.stereotype.Service
public class Service {

  public int calculateResult(String action, UntilNumber untilNumber) {
    int until = untilNumber.getUntil();
    if (action.equals("sum")) {
      return sum(until);
    } else {
      return factor(until);
    }
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
