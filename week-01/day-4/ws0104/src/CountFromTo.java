import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int FirstNumber = scan.nextInt();
    int SecondNumber = scan.nextInt();

    if (SecondNumber <= FirstNumber) {
      System.out.println("Second number should be bigger");
    } else {
      int Diff = SecondNumber - FirstNumber;
      for (int i = 0; i < Diff; ++i) {
        System.out.println(FirstNumber + i);
      }
    }

    scan.close();
  }
}
