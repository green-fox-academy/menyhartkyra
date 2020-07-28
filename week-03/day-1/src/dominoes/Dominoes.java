package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    System.out.println(dominoes);

    int size = dominoes.size();
    outer:
    for ( int k =0; k < size; k++ ) {       //elore viszi ha van olyan szam bal oldalon, aminek nincs parja
      int left = dominoes.get(k).getLeftSide();
      int i;
      for (i = 0; i < size; i++) {
        if (left == dominoes.get(i).getRightSide()) {
          continue outer;
        }
      }
      dominoes.add(0, dominoes.get(k));
      dominoes.remove(k + 1);
    }

    for (int i = 0; i < dominoes.size() - 1; i++) {
      int k = i + 1;
      while (dominoes.get(i).getRightSide() != dominoes.get(k).getLeftSide()) {
        k++;
      }
      dominoes.add(i + 1, dominoes.get(k));
      dominoes.remove(k + 1);
    }
    System.out.println(dominoes);
  }


  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(9, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}