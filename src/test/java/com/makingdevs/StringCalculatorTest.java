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

  
}