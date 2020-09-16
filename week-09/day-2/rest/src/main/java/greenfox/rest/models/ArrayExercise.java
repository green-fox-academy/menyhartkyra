package greenfox.rest.models;

import java.util.Arrays;
import lombok.Getter;

@Getter
public class ArrayExercise {
  private String what;
  private int[] numbers;

  @Override
  public String toString() {
    return "{" +
        "what='" + what + '\'' +
        ", numbers=" + Arrays.toString(numbers) +
        '}';
  }
}
