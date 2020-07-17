import java.util.Scanner;

public class Diagonal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Lines = scanner.nextInt();

    for (int j = 0; j < Lines; j++) {
      System.out.print("%");
    }
    System.out.println("");

    for (int i = 1; i < Lines - 1; i++) {
      System.out.print("%");          //%jel
      for (int k = 0; k < i - 1; k++) { //spacek elöl
        System.out.print(" ");
      }
      System.out.print("%");      ////%jel
      for (int k = 0; k < Lines - 2 - i; k++) { //spacek hátul
        System.out.print(" ");
      }
      System.out.print("%\n");    //%jel
    }

    for (int j = 0; j < Lines; j++) {
      System.out.print("%");
    }
    System.out.println("");

    scanner.close();
  }
}
