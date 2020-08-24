import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

  public void printEvenNumbers(List<Integer> numbers){
    List<Integer> evenNumbers = numbers.stream()
        .filter(number -> number % 2 == 0)
        .collect(Collectors.toList());
    System.out.println(evenNumbers);
  }

}
