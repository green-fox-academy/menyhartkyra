package test;

import static org.junit.jupiter.api.Assertions.*;


import apples.Apples;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ApplesTest {
  private static Apples apple;

  @BeforeAll
  public static void setup() {
    apple = new Apples();
  }

  @Test
  void getApple() {
    assertEquals("milk", apple.getApple());
  }
}