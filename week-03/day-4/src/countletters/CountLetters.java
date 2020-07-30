package countletters;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

public class CountLetters {

  public HashMap<Character, Integer> countLetters(String s) {
    HashMap<Character, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (dictionary.containsKey(s.charAt(i))){
        dictionary.put( s.charAt(i),dictionary.get(s.charAt(i))+1 );
      }else {
        dictionary.put(s.charAt(i), 1);
      }
    }
    return dictionary;
  }
}
