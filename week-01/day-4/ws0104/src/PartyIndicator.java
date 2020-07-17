import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int girls = scan.nextInt();
    int boys = scan.nextInt();
    int all = girls + boys;

    if (girls == 0) {
      System.out.println("Sausage party");
    } else if (all >= 20) {
      if (girls == boys) {
        System.out.println("excellent party");
      } else {
        System.out.println("quite cool party");
      }
    } else {
      System.out.println("average party");
    }

    scan.close();
  }
}
