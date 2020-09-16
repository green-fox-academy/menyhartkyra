package greenfox.rest.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SithText {
  private String sith_text;

  public SithText(String sith_text) {
    this.sith_text = sith_text;
  }
}
