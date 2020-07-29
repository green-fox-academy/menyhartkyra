package fibonacci;

public class Fibonacci {
  public static void main(String[] args) {
    try {
      System.out.println(fibonacci(50));
    } catch (StackOverflowError e) {
      System.out.println("don't give me a negative number");
    }
  }

  public static long fibonacci(long nth) {
    if (nth == 0 || nth == 1) {
      return 1;
    } else {
      return fibonacci(nth - 1) + fibonacci(nth - 2);
    }
  }

}
