package strings;

public class StringsAgain {
  public static void main(String[] args) {
    try {
      System.out.println(removeX("valaximixix"));
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      System.out.println("this is not enough string");
    }
  }

  public static String removeX(String s) {
    if (s.length() == 1) {
      if (s.charAt(0)=='x')
        return "";
      else
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
