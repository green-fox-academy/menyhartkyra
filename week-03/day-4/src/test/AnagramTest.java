package test;

import static org.junit.jupiter.api.Assertions.*;


import anagram.Anagram;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AnagramTest {
  private static Anagram anagram;
  @BeforeAll
  public static void setup(){
    anagram = new Anagram();
  }
  @Test
  void isAnagram() {
    assertTrue(anagram.isAnagram("kirte","triek"));
    assertFalse(anagram.isAnagram("alma","k0rte"));
  }
}