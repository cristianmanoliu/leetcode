package com.hashmap_set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UniqueNumberOfOccurrencesTest {

  private final UniqueNumberOfOccurrences underTest = new UniqueNumberOfOccurrences();

  @Test
  public void uniqueOccurrences() {
    assertTrue(underTest.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    assertFalse(underTest.uniqueOccurrences(new int[]{1, 2}));
  }
}