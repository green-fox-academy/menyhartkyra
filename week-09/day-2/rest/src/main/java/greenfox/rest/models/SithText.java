package greenfox.rest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SithText {
  @JsonProperty("sith_text")
  private String sithText;

  public SithText(String sithText) {
    this.sithText = sithText;
  }
}
