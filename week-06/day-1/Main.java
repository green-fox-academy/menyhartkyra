import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    EvenNumbers evenNumbers = new EvenNumbers();
    evenNumbers.printEvenNumbers(numbers);

    SquaredValueOfPositiveNumbers.printSqaredValueOfPositiveNumbers(numbers);

    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
//    Map<Integer, Integer> map = numbers3.stream()
//        .collect(Collectors.toMap(
//            number -> number,
//            number -> number*number));
    //IntSummaryStatistics stats = map.values().stream().mapToInt((number) -> number).summaryStatistics();
    List<Integer> numbersSqaredBiggerThan20 =
        numbers3.stream().filter(number -> number * number > 20).collect(Collectors.toList());
    System.out.println(numbersSqaredBiggerThan20);
  }
}
