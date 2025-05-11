package io.github.cristianmanoliu.sliding_window;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.cristianmanoliu.sliding_window.MaximumAverageSubarrayI;
import org.junit.jupiter.api.Test;

public class MaximumAverageSubarrayITest {

  private final MaximumAverageSubarrayI maximumAverageSubarrayI = new MaximumAverageSubarrayI();

  @Test
  void findMaxAverageExample_1() {
    assertEquals(12.75d, maximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
  }

  @Test
  void findMaxAverageExample_2() {
    assertEquals(5d, maximumAverageSubarrayI.findMaxAverage(new int[]{5}, 1));
  }

  @Test
  void findMaxAverageSubmitDefect_1() {
    assertEquals(3.3333d, maximumAverageSubarrayI.findMaxAverage(new int[]{3, 3, 4, 3, 0}, 3), 0.0001d);
  }

  @Test
  void findMaxAverageSubmitDefect_2() {
    assertEquals(2d, maximumAverageSubarrayI.findMaxAverage(new int[]{0, 1, 1, 3, 3}, 4), 0.0001d);
  }
}