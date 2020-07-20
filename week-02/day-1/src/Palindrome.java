public class Palindrome {
  public static void main(String[] args) {
    //Create a function named create palindrome following your current language's style guide.
    // It should take a string, create a palindrome from it and then return it.
    System.out.println(palindrome("123"));
    System.out.println(palindrome("greenfox"));
    System.out.println(palindrome(""));
  }

  public static String palindrome(String s) {
    int length = s.length();
    for (int i = 0; i < length; i++) {
      s += s.charAt(length-1-i);
    }
    return s;
  }
}
