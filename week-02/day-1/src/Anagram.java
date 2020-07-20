import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    //Create a function named is anagram following your current language's style guide. It should
    // take two strings and return a boolean value depending on whether its an anagram or not.
    System.out.println(isAnagram("dog", "god"));
    System.out.println(isAnagram("green", "fox"));
  }

  public static boolean isAnagram(String str1, String str2) {
    //create char arrays from strings:
    char[] charStr1 = str1.toCharArray();
    char[] charStr2 = str2.toCharArray();

    Arrays.sort(charStr1);
    Arrays.sort(charStr2);

    return Arrays.equals(charStr1, charStr2);
  }
}
