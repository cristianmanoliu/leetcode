package com.prefix_sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindTheHighestAltitudeTest {

  private final FindTheHighestAltitude underTest = new FindTheHighestAltitude();

  @Test
  public void largestAltitude() {
    assertEquals(1, underTest.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    assertEquals(0, underTest.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
  }
}