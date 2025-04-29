package cma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestSubArrayOf1sAfterDeletingOneElementTest {

  private final LongestSubArrayOf1sAfterDeletingOneElement underTest = new LongestSubArrayOf1sAfterDeletingOneElement();

  @Test
  public void longestSubArray() {
    assertEquals(3, underTest.longestSubArray(new int[]{1, 1, 0, 1}));
    assertEquals(5, underTest.longestSubArray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
    assertEquals(2, underTest.longestSubArray(new int[]{1, 1, 1}));
  }
}