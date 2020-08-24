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

    //exercise 2
    SquaredValueOfPositiveNumbers.printSqaredValueOfPositiveNumbers(numbers);

    //exercise 4
    double averageOfOdds =
        numbers.stream()
            .filter(n -> n % 2 != 0)
            .collect(Collectors.averagingInt(n -> n));
    System.out.println(averageOfOdds);

    //exercise 3
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
