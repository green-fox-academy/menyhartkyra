package strings;

public class Strings {
  public static void main(String[] args) {
    try {
      System.out.println(changeXtoY("valamixix"));
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      System.out.println("this is not enough string");
    }
  }

  public static String changeXtoY(String s) {
    if (s.length() == 1) {
      if (s.charAt(0)=='x')
        return "y";
      else
        return s;
    } else {
      if (s.charAt(0) == 'x') {
        return 'y' + changeXtoY(s.substring(1));
      } else {
        return s.charAt(0) + changeXtoY(s.substring(1));
      }
    }
  }
}
