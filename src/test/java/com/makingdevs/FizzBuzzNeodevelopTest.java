package com.makingdevs;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class FizzBuzzNeodevelopTest {

  @Test
  public void testFizz(){
    FizzBuzzNeodevelop fb = new FizzBuzzNeodevelop();
    String result = fb.compute(6);
    assertEquals("Fizz", result);
  }
}

