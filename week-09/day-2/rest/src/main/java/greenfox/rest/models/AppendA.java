package greenfox.rest.models;

import lombok.Getter;

@Getter
public class AppendA {
  private String appended;

  public AppendA(String appandable) {
    appended = appandable.concat("a");
  }
}
