import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Number = scan.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + Number + " = " + i*Number);
        }
        scan.close();
    }
}
