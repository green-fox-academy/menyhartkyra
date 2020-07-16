import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Lines = scanner.nextInt();

        for (int i = 1; i < Lines+1 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        scanner.close();
    }
}
