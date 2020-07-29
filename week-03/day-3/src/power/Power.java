package power;

public class Power {

  public static void main(String[] args) {
    try {
      System.out.println(powerN(5, 5));
    } catch (java.lang.StackOverflowError e){
      System.out.println("base and n should be bigger than zero");
    }
  }

  public static int powerN(int base, int n) {
    if (n == 0) {
      return 1;
    } else {
      return base * powerN(base, n - 1);
    }
  }

}
