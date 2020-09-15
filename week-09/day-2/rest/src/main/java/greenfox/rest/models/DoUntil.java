package greenfox.rest.models;

import greenfox.rest.service.Service;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Getter
@Setter
public class DoUntil {
  private int result;

  public DoUntil(int result) {
    this.result = result;
  }
}