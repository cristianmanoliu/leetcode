package com.hashmap_set;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EqualRowAndColumnPairsTest {

  private final EqualRowAndColumnPairs equalRowAndColumnPairs = new EqualRowAndColumnPairs();

  @Test
  void equalPairs() {
    assertEquals(3, equalRowAndColumnPairs.equalPairs(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}}));
    assertEquals(1, equalRowAndColumnPairs.equalPairs(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}));
  }
}