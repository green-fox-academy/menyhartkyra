public class Sum {
  public static void main(String[] args) {
    // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
    int number = 6;
    System.out.println(sum(number));
  }

  public static int sum(int number) {
    int sum = 0;
    for (int i = 0; i < number + 1; i++) {
      sum += i;
    }
    return sum;
  }
}
