package io.github.cristianmanoliu.hashmap_set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.cristianmanoliu.hashmap_set.UniqueNumberOfOccurrences;
import org.junit.jupiter.api.Test;

class UniqueNumberOfOccurrencesTest {

  private final UniqueNumberOfOccurrences uniqueNumberOfOccurrences = new UniqueNumberOfOccurrences();

  @Test
  void uniqueOccurrences() {
    assertTrue(uniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    assertFalse(uniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1, 2}));
  }
}