package numberadder;

public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(numberAdder(5));
  }

  public static int numberAdder(int n) {
    if (n == 1) {
      return 1;
    } else {
      return numberAdder(n - 1) + n;
    }
  }

}
