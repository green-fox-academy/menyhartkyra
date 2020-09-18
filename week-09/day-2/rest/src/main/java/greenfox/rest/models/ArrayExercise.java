package greenfox.rest.models;

import java.util.Arrays;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ArrayExercise {
  private String what;
  private int[] numbers;

  public ArrayExercise(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  @Override
  public String toString() {
    return "{" +
        "what='" + what + '\'' +
        ", numbers=" + Arrays.toString(numbers) +
        '}';
  }
}
