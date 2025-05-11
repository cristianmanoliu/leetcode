package io.github.cristianmanoliu.sliding_window;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.cristianmanoliu.sliding_window.LongestSubArrayOf1sAfterDeletingOneElement;
import org.junit.jupiter.api.Test;

class LongestSubArrayOf1sAfterDeletingOneElementTest {

  private final LongestSubArrayOf1sAfterDeletingOneElement longestSubArrayOf1sAfterDeletingOneElement = new LongestSubArrayOf1sAfterDeletingOneElement();

  @Test
  void longestSubArray() {
    assertEquals(3, longestSubArrayOf1sAfterDeletingOneElement.longestSubArray(new int[]{1, 1, 0, 1}));
    assertEquals(5, longestSubArrayOf1sAfterDeletingOneElement.longestSubArray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
    assertEquals(2, longestSubArrayOf1sAfterDeletingOneElement.longestSubArray(new int[]{1, 1, 1}));
  }
}