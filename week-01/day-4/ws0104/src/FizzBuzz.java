public class FizzBuzz {
    public static void main(String[] args) {
        int i = 1;
        while ( i < 101 ){
            if (i %3 == 0){
                System.out.print("Fizz");
                if (i %5 == 0 ){
                    System.out.print("Buzz");
                }
            }else if (i %5 == 0 ){
                System.out.print("Buzz");
            }    else{
                System.out.print(i);
            }
            System.out.println("");
            i++;
        }
    }
}
