import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Lines = scanner.nextInt();
        int l = Lines/2+1;

        for (int i = 0; i < l ; i++) {
            for (int j = 0; j < l - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = l-2; i >=0 ; i--) {
            for (int j = l-i-1; j >=0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 2*i; j >=0 ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        scanner.close();
    }
}