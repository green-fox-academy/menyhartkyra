import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenNumbers implements Predicate<Integer> {

  public void printEvenNumbers(List<Integer> numbers){
    List<Integer> evenNumbers = numbers.stream()
        .filter(number -> number % 2 == 0)
        .collect(Collectors.toList());
    System.out.println(evenNumbers);

    System.out.println("with own predicate");
    List<Integer> evenNumbers2 = numbers.stream()
        .filter(this::test)
        .collect(Collectors.toList());
    System.out.println(evenNumbers);
  }

  @Override
  public boolean test(Integer number) {
    return number %2 == 0;
  }
}
