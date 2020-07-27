import java.util.Arrays;

public class SubInt {
  public static void main(String[] args) {
    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of
    //  Or returns an empty array if the number is not part of any of the integers in the array

    //  Example:
    System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
    //  should print: `[0, 1, 4]`
    System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    //  should print: '[]'
  }

  public static String subInt(int number, int[] array) {
    String strNum = Integer.toString(number);
    //System.out.println("strNum: " + strNum);
    String[] strArray = new String[array.length];
    int resultLength = 0;
    int[] preresult = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      strArray[i] = Integer.toString(array[i]);
      if (strArray[i].contains(strNum)) {
        preresult[i] = i;
        resultLength += 1;
      } else {
        preresult[i] = 0;
      }
    }
    //System.out.println(Arrays.toString(strArray));
    //System.out.println("preresult: " + Arrays.toString(preresult));
    int[] result = new int[resultLength];
    int cnt = 0;
    for (int i : preresult) {
      if (i != 0) {
        result[cnt] = i;
        cnt++;
      }
    }
    Arrays.sort(result);
    return Arrays.toString(result);
  }

}