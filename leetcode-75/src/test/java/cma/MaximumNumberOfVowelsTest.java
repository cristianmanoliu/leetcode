package cma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumNumberOfVowelsTest {

  private final MaximumNumberOfVowels underTest = new MaximumNumberOfVowels();

  @Test
  public void maxVowels() {
    assertEquals(3, underTest.maxVowels("abciiidef", 3));
    assertEquals(2, underTest.maxVowels("aeiou", 2));
    assertEquals(0, underTest.maxVowels("xyz", 1));
    assertEquals(5, underTest.maxVowels("aeiouaeiouaeiou", 5));
    assertEquals(0, underTest.maxVowels("bcdfghjklmnpqrstvwxyz", 4));
    assertEquals(2, underTest.maxVowels("leetcode", 2));
  }
}