package io.github.cristianmanoliu.prefix_sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.cristianmanoliu.prefix_sum.FindTheHighestAltitude;
import org.junit.jupiter.api.Test;

class FindTheHighestAltitudeTest {

  private final FindTheHighestAltitude findTheHighestAltitude = new FindTheHighestAltitude();

  @Test
  void largestAltitude() {
    assertEquals(1, findTheHighestAltitude.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    assertEquals(0, findTheHighestAltitude.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
  }
}