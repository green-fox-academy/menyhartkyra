package strings;

public class StringsAgainAndAgain {
  public static void main(String[] args) {
    try {
      System.out.println(addStarSeparator("valaximixi"));
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      System.out.println("this is not enough string");
    }
  }

  public static String addStarSeparator(String s) {
    if (s.length() == 1) {
      return s;
    } else {
      return s.charAt(0) + "*" + addStarSeparator(s.substring(1));
    }
  }
}
