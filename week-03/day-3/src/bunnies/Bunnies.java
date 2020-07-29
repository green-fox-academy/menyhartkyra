package bunnies;

public class Bunnies {
  public static void main(String[] args) {
    try {
      System.out.println(numberOfBunnyEars(6));
    } catch (java.lang.StackOverflowError e){
      System.out.println("number of bunnies should be min 0.");
    }
  }

  public static int numberOfBunnyEars(int numberOfBunnies) {
    if (numberOfBunnies == 1) {
      return 2;
    } else if (numberOfBunnies == 0){
      return 0;
    } else {
      return 2 + numberOfBunnyEars(numberOfBunnies - 1);
    }
  }

}
