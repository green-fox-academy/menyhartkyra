package gfa.orientation.exampleexam.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "urls")
public class Url {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String url;
  private String alias;
  private int hitCount;
  @JsonIgnore
  private int secretCode;

  public Url() {
  }

  public Url(String url, String alias) {
    hitCount = 0;
    this.url = url;
    this.alias = alias;
    secretCode = generateRandomBetween(1000,9999);
  }

  public int generateRandomBetween(int min, int max) {
    int interval = max - min + 1;
    return (int) (Math.random() * interval + min);
  }
}
