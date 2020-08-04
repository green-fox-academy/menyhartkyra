package test;

import static org.junit.jupiter.api.Assertions.*;


import fibonacci.Fibonacci;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FibonacciTest {
  private static Fibonacci fibonacci;

  @BeforeAll
  public static void setup(){
    fibonacci = new Fibonacci();
  }

  @Test
  void fibonacci() {
    assertEquals(1, Fibonacci.fibonacci(0));
    assertEquals(1, fibonacci.fibonacci(1));
    assertEquals(21, fibonacci.fibonacci(7));
  }
}