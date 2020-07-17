import java.util.Scanner;

public class Substring {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    String q = scanner.nextLine();

    int index = input.indexOf(q);
    System.out.println(index);

    scanner.close();

  }
}
