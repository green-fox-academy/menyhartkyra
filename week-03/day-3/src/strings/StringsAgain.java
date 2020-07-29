package strings;

public class StringsAgain {
  public static void main(String[] args) {
    try {
      System.out.println(removeX("valaximixi"));
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      System.out.println("this is not enough string");
    }
  }

  public static String removeX(String s) {
    if (s.length() == 1) {
      return s;
    } else {
      if (s.charAt(0) == 'x') {
        return removeX(s.substring(1));
      } else {
        return s.charAt(0) + removeX(s.substring(1));
      }
    }
  }
}
