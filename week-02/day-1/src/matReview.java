import java.util.Arrays;
import java.util.Scanner;

public class matReview {
  public static void bubbleSort(int[] numbers) {
    Arrays.sort(numbers);
  }
  public static void main(String[] args) {
    int[] numbers = new int[] {75 , 26 , 13};

    System.out.println(numbers[0]);
    System.out.println(numbers.length);

    for (int i: numbers) {
      System.out.println(i);
    }

    //Arrays.sort(numbers);       //sorba rakja, el is menti
    bubbleSort(numbers);
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.binarySearch(numbers,13));

    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
  }

}
