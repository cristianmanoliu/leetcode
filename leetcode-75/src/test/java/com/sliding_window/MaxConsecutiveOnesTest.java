package com.sliding_window;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {

  private final MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();

  @Test
  void longestOnes() {
    assertEquals(6, maxConsecutiveOnes.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
  }
}