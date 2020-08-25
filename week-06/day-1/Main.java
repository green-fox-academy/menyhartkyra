import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    //Map<Integer, Integer> map = numbers3.stream()
    //    .collect(Collectors.toMap(
    //        number -> number,
    //        number -> number*number));
    //IntSummaryStatistics stats = map.values().stream().mapToInt((number) -> number).summaryStatistics();
    List<Integer> numbersSqaredBiggerThan20 =
        numbers3.stream().filter(number -> number * number > 20).collect(Collectors.toList());
    System.out.println(numbersSqaredBiggerThan20);

    //exercise 5
    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    int sumOfOdds = numbers5.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n).sum();
    System.out.println("Sum of odd numbers: " + sumOfOdds);

    //exercise 6
    String s = "dkdAckIVkdL";
    Stream<Character> characterStream = s.chars()
        .mapToObj(c -> (char) c);
    characterStream.filter(Character::isUpperCase).forEach(System.out::print);
  }
}
