import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    EvenNumbers evenNumbers = new EvenNumbers();
    evenNumbers.printEvenNumbers(numbers);

    SquaredValueOfPositiveNumbers.printSqaredValueOfPositiveNumbers(numbers);

  }
}
