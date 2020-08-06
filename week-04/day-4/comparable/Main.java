package comparable;

import java.util.Collections;
import java.util.List;
import static comparable.Dominoes.*;

public class Main {
  public static void main(String[] args) {
    List<Domino> dominos = initializeDominoes();
    System.out.println(dominos);
    //System.out.println(dominos.get(0).compareTo(dominos.get(4)));
    Collections.sort(dominos, Domino::compareTo);
    System.out.println(dominos);
  }
}
