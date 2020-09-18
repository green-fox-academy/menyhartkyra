package greenfox.rest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Getter
@Repository
@Setter
@NoArgsConstructor
public class Text {
  private String text;

  public Text(String text) {
    this.text = text;
  }
}
