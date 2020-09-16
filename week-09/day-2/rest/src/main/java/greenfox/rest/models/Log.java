package greenfox.rest.models;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Log {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private LocalDateTime createdAt;
  private String endpoint;
  private String data;

  public Log(String endpoint, String data) {
    createdAt = LocalDateTime.now();
    this.endpoint = endpoint;
    this.data = data;
  }
}
