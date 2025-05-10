package com.prefix_sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindPivotIndexTest {

  private final FindPivotIndex findPivotIndex = new FindPivotIndex();

  @Test
  void pivotIndex() {
    assertEquals(3, findPivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
  }
}