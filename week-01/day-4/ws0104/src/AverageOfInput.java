import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {

    int a;
    int i;
    int sum = 0;

    Scanner scanner = new Scanner(System.in);
    for (i = 0; i < 5; i++) {
      a = scanner.nextInt();
      sum += a;
    }

    int average = sum / i;

    System.out.println("sum = " + sum + ";i= " + i);
    System.out.println("average = " + average);

    scanner.close();
  }
}
