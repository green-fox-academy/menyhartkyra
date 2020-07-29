package sumdigits;

public class SumDigits {
  public static void main(String[] args) {
    try {
      System.out.println(sumDigits(456));
    } catch (java.lang.NumberFormatException e) {
      System.out.println("the number can't be negative");
    }
  }

  public static int sumDigits(int n) {
    if (n < 0) {
      return Integer.parseInt(null);
    }
    if (n == 0) {
      return 0;
    } else if (n == n % 10) {
      return n;
    } else {
      int newN = (n - n % 10) / 10;
      return sumDigits(newN) + n % 10;
    }
  }

}
