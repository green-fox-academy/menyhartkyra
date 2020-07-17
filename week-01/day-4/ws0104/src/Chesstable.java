import java.util.Scanner;

public class Chesstable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Lines = scanner.nextInt();

    for (int i = 0; i < Lines; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < Lines / 2; j++) {
          System.out.print("% ");
        }
        System.out.println("");
      } else {
        for (int j = 0; j < Lines / 2; j++) {
          System.out.print(" %");
        }
        System.out.println("");
      }
    }
    scanner.close();
  }
}
