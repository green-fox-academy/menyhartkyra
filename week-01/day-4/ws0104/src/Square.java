import java.sql.SQLOutput;
import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Lines = scanner.nextInt();

    for (int j = 0; j < Lines; j++) {
      System.out.print("%");
    }
    System.out.println("");
    for (int i = 0; i < Lines - 2; i++) {
      System.out.print("%");
      for (int k = 0; k < Lines - 2; k++) {
        System.out.print(" ");
      }
      System.out.print("%\n");
    }
    for (int j = 0; j < Lines; j++) {
      System.out.print("%");
    }
    System.out.println("");

    scanner.close();
  }
}
