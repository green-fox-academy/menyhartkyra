package test;

import static org.junit.jupiter.api.Assertions.*;


import extension.Extension;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ExtensionTest {
  private static Extension extension;

  @BeforeAll
  public static void setup(){
    extension = new Extension();
  }

  @Test
  void add() {
    assertEquals(2, extension.add(1, 1));
  }

  @Test
  void maxOfThree() {
    assertEquals(6, extension.maxOfThree(2,1,6));
  }

  @Test
  void median() {
    List<Integer> vmi = new ArrayList<>();
    vmi.add(1); vmi.add(2);
    assertEquals(1, extension.median(vmi));
  }

  @Test
  void isVowel() {
  }

  @Test
  void translate() {
  }
}