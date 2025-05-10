package com.sliding_window;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumNumberOfVowelsTest {

  private final MaximumNumberOfVowels maximumNumberOfVowels = new MaximumNumberOfVowels();

  @Test
  void maxVowels() {
    assertEquals(3, maximumNumberOfVowels.maxVowels("abciiidef", 3));
    assertEquals(2, maximumNumberOfVowels.maxVowels("aeiou", 2));
    assertEquals(0, maximumNumberOfVowels.maxVowels("xyz", 1));
    assertEquals(5, maximumNumberOfVowels.maxVowels("aeiouaeiouaeiou", 5));
    assertEquals(0, maximumNumberOfVowels.maxVowels("bcdfghjklmnpqrstvwxyz", 4));
    assertEquals(2, maximumNumberOfVowels.maxVowels("leetcode", 2));
  }
}