package test;

import static math.MathUtils.*;
import static org.junit.jupiter.api.Assertions.*;


import math.MathUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

  private static MathUtils mathUtils = new MathUtils();


  /*@BeforeAll
  public static void setup(){
    mathUtils = new MathUtils();
  }*/

  @Test
  void test2() {
    assertEquals(5, mathUtils.addk(6, 0));
  }


  @Test
  void test1() {
    assertEquals(5, mathUtils.addk(2, 3));
  }
}