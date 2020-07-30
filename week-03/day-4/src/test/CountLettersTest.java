package test;

import static org.junit.jupiter.api.Assertions.*;


import countletters.CountLetters;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CountLettersTest {

  private static CountLetters countLetters;

  @BeforeAll
  public static void setup(){
    countLetters = new CountLetters();
  }

  @Test
  void countLetters() {
    assertEquals(3, countLetters.countLetters("aaabbcccc").get('a'));
  }
}