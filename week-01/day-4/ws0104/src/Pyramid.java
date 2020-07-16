import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Lines = scanner.nextInt();

        for (int i = 0; i < Lines ; i++) {
            for (int j = 0; j < Lines-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        scanner.close();
    }
}
