package com.makingdevs;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {

  @Test
  public void testEmpty(){
    StringCalculator sc = new StringCalculator();
    int result = sc.add("");
    assertEquals(0, result);
  }

  @Test
  public void testOneNumber(){
    StringCalculator sc = new StringCalculator();
    int result = sc.add("4");
    assertEquals(4, result);
  }

  @Test
  public void testTwoNumbers(){
    StringCalculator sc = new StringCalculator();
    int result = sc.add("4,5");
    assertEquals(9, result);
    result = sc.add("8,5");
    assertEquals(13, result);
  }
}