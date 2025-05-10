package com.sliding_window;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumAverageSubarrayITest {

  private final MaximumAverageSubarrayI underTest = new MaximumAverageSubarrayI();

  @Test
  public void findMaxAverageExample_1() {
    assertEquals(12.75d, underTest.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
  }

  @Test
  public void findMaxAverageExample_2() {
    assertEquals(5d, underTest.findMaxAverage(new int[]{5}, 1));
  }

  @Test
  public void findMaxAverageSubmitDefect_1() {
    assertEquals(3.3333d, underTest.findMaxAverage(new int[]{3, 3, 4, 3, 0}, 3), 0.0001d);
  }

  @Test
  public void findMaxAverageSubmitDefect_2() {
    assertEquals(2d, underTest.findMaxAverage(new int[]{0, 1, 1, 3, 3}, 4), 0.0001d);
  }
}