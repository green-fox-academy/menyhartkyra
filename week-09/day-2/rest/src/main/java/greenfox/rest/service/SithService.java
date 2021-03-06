package greenfox.rest.service;

import greenfox.rest.models.SithText;
import greenfox.rest.models.Text;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class SithService {
  private String[] randomWords;

  public SithService() {
    randomWords = new String[] {
        "aah!", "aha", "ahem", "ahh", "ahh", "argh", "aww", "aww", "aw", "bah", "boo", "boo!",
        "boo-hoo", "brr", "d'oh", "duh", "eek", "eep", "eh?", "eh?", "eww", "fuff", "gah", "gee",
        "grr", "hmm", "humph", "hah", "haha", "huh", "hurrah", "ick", "meh", "mhm", "mm", "muahaha",
        "mwah", "nah", "nuh-uh", "oh", "ooh-la-la", "ooh", "oomph", "oops", "ouch", "oww", "oy",
        "oy", "pew", "pff", "phew", "psst", "sheesh", "shh", "shoo", "tsk-tsk", "uh-huh", "uh-oh",
        "uh-uh", "uhh", "umm", "waah", "wee", "whoa", "wow", "yahoo", "yay", "yeah", "yee-haw",
        "yikes", "yoo-hoo", "yuh-uh", "yuck", "zing"
    };
    addDeclarationPoint(randomWords);
  }

  public SithText sithText(Text text){
    return changeWordSequence(separateSentences(text));
  }

  public List<String> separateSentences(Text text) {
    String allText = text.getText();
    String[] sentences = allText.split("\\. ");
    String sentence = sentences[sentences.length - 1];
    sentence = sentence.substring(0, sentence.length() - 1);
    sentences[sentences.length - 1] = sentence;
    return Arrays.asList(sentences);
  }

  public SithText changeWordSequence(List<String> sentences) {
    String sithText = "";
    for (String sentence : sentences) {
      List<String> words = Arrays.asList(sentence.split(" ").clone());
      words.set(0, words.get(0).toLowerCase());
      String sithSentence = createSithSequencedSentence(words);
      sithSentence = removeSpaceFromEnd(sithSentence);
      sithSentence = changeFirstCharToUppercase(sithSentence) + ". ";
      sithText = sithText.concat(sithSentence).concat(getRandomWord());
      if (!sentence.equals(sentences.get(sentences.size() - 1))) {
        sithText = sithText.concat(" ");
      }
    }
    return new SithText(sithText);
  }

  private String createSithSequencedSentence(List<String> words) {
    List<String> evenWords = new ArrayList<>();
    List<String> oddWords = new ArrayList<>();
    for (int i = 0; i < words.size(); i = i + 2) {
      evenWords.add(words.get(i) + " ");
    }
    for (int i = 1; i < words.size(); i = i + 2) {
      oddWords.add(words.get(i) + " ");
    }
    String sithSentence = "";
    for (int i = 0; i < oddWords.size(); i++) {
      sithSentence += oddWords.get(i).concat(evenWords.get(i));
    }
    if (evenWords.size() > oddWords.size()) {
      sithSentence = sithSentence.concat(evenWords.get(evenWords.size() - 1));
    }
    return sithSentence;
  }

  private String removeSpaceFromEnd(String str) {
    str = str.substring(0, str.length() - 1);
    return str;
  }

  private String changeFirstCharToUppercase(String sithSentence) {
    Character c = Character.toUpperCase((sithSentence.charAt(0)));
    String sentenceWithoutFirstChar = sithSentence.substring(1);
    return c.toString() + sentenceWithoutFirstChar;
  }

  public void addDeclarationPoint(String[] words) {
    for (int i = 0; i < words.length; i++) {
      char c = Character.toUpperCase(words[i].charAt(0));
      words[i] = words[i].substring(1);
      words[i] = Character.toString(c).concat(words[i]);
      if (!words[i].contains("?") && !words[i].contains("!")) {
        words[i] = words[i].concat(".");
      }
    }
  }

  public String getRandomWord() {
    return randomWords[generateRandomNumberBetween(0, randomWords.length - 1)];
  }

  public int generateRandomNumberBetween(int min, int max) {
    int interval = max - min + 1;
    return (int) (Math.random() * interval + min);
  }
}
