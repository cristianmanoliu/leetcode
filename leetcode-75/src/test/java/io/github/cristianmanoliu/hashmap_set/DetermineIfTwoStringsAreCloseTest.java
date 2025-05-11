package io.github.cristianmanoliu.hashmap_set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.cristianmanoliu.hashmap_set.DetermineIfTwoStringsAreClose;
import org.junit.jupiter.api.Test;

class DetermineIfTwoStringsAreCloseTest {

  private final DetermineIfTwoStringsAreClose determineIfTwoStringsAreClose = new DetermineIfTwoStringsAreClose();

  @Test
  void closeStrings() {
    assertTrue(determineIfTwoStringsAreClose.closeStrings("abc", "bca"), "'abc' and 'bca' should be close");
    assertFalse(determineIfTwoStringsAreClose.closeStrings("a", "aa"), "'a' and 'aa' should not be close");
    assertTrue(determineIfTwoStringsAreClose.closeStrings("cabbba", "abbccc"), "'cabbba' and 'abbccc' should be close");
  }
}