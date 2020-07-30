package test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sum.Sum;

class SumTest {

  private static Sum sum;
  private static ArrayList<Integer> testList;

  @BeforeAll
  public static void setup() {
    testList = new ArrayList<>();
    testList.add(5);
    testList.add(8);
    sum = new Sum();
  }

  @Test
  void test() {
    assertEquals(13, sum.sum(testList));
  }

  @Test
  void testWithEmptyList(){
    ArrayList<Integer> emptyList = new ArrayList<>();
    assertEquals(0, sum.sum(emptyList));
  }
  @Test
  void testWithOneElement(){
    ArrayList<Integer> oneElement = new ArrayList<>();
    oneElement.add(5);
    assertEquals(5, sum.sum(oneElement));
  }

  void testWtihNull(){
    ArrayList<Integer> nullList = null;
    assertEquals(null, sum.sum(nullList));
  }
}