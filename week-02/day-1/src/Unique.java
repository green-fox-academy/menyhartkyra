import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    System.out.println(removeDuplicates(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
  }

  public static List<Integer> removeDuplicates(int[] numbers) {
    Integer[] numbersIntiger = IntStream.of(numbers).boxed().toArray(Integer[]::new);
    Set<Integer> set = new HashSet<Integer>(Arrays.asList(numbersIntiger));
    List<Integer> sortedList = new ArrayList<>(set);
    Collections.sort(sortedList);
    return sortedList;
  }
}
