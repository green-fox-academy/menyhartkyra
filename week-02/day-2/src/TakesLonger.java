import java.util.Arrays;

public class TakesLonger {
  public static void main(String... args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occurred. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)
    String[] quoteArray = quote.split("It ", 2);
    //System.out.println(Arrays.toString(quoteArray));
    quote = quoteArray[0].concat("It always takes longer than ");
    quote = quote.concat(quoteArray[1]);
    System.out.println(quote);
  }
}