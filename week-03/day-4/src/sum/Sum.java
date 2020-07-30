package sum;

import java.util.ArrayList;
import java.util.Iterator;

public class Sum {

  public Integer sum(ArrayList<Integer> numbers) {
    Integer sum = 0;
    Iterator<Integer> iterator = numbers.iterator();
    while (iterator.hasNext()) {
      sum += iterator.next();
    }
    return sum;
  }
}
