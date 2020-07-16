import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Number = 45;
        int guess;
         while(true){
             guess = scanner.nextInt();
             if (guess > Number){
                 System.out.println("The stored number is smaller");
                 continue;
             }else if (guess < Number){
                 System.out.println("The stored number is higher");
                 continue;
             }else{
                 System.out.println("you found the number: " + Number);
                 break;
             }
         }
         scanner.close();
    }
}
