import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Parameter = scanner.nextInt();
        int Sum = 0;

        for (int i = 0; i < Parameter; i++) {
            Sum += scanner.nextInt();
        }
        int Average = Sum/Parameter;
        System.out.println("sum = " + Sum + ", average = " + Average);

        scanner.close();
    }
}
