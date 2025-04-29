package cma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {

  private final MaxConsecutiveOnes underTest = new MaxConsecutiveOnes();

  @Test
  public void longestOnes() {
    assertEquals(6, underTest.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
  }
}