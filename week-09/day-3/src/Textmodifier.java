import java.util.Arrays;

public class Textmodifier {

  public static void main(String[] args) {
    String[] randomWords = new String[] {
        "aah!", "aha", "ahem", "ahh", "ahh", "argh", "aww", "aww", "aw", "bah", "boo", "boo!",
        "boo-hoo", "brr", "d'oh", "duh", "eek", "eep", "eh?", "eh?", "eww", "fuff", "gah", "gee",
        "grr", "hmm", "humph", "hah", "haha", "huh", "hurrah", "ick", "meh", "mhm", "mm", "muahaha",
        "mwah", "nah", "nuh-uh", "oh", "ooh-la-la", "ooh", "oomph", "oops", "ouch", "oww", "oy",
        "oy", "pew", "pff", "phew", "psst", "sheesh", "shh", "shoo", "tsk-tsk", "uh-huh", "uh-oh",
        "uh-uh", "uhh", "umm", "waah", "wee", "whoa", "wow", "yahoo", "yay", "yeah", "yee-haw",
        "yikes", "yoo-hoo", "yuh-uh", "yuck", "zing"
    };
    addDeclarationPoint(randomWords);
    System.out.println(Arrays.toString(randomWords));
  }

  public static void addDeclarationPoint(String[] words) {
    for (int i = 0; i < words.length; i++) {
      char c = Character.toUpperCase(words[i].charAt(0));
      words[i] = words[i].substring(1);
      words[i] = Character.toString(c).concat(words[i]);
      if (!words[i].contains("?") && !words[i].contains("!")) {
        words[i] = words[i].concat(".");
      }
    }
  }
}
