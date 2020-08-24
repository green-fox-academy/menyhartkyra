import java.util.List;
import java.util.stream.Collectors;

public class SquaredValueOfPositiveNumbers {

  public static void printSqaredValueOfPositiveNumbers(List<Integer> numbers){
    List<Integer> squaredPositives = numbers.stream()
        .filter(number -> number > 0)
        .map(number -> number*number).collect(Collectors.toList());
    System.out.println(squaredPositives);
  }
}
