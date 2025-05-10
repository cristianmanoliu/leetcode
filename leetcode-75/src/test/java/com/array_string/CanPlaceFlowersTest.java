package com.array_string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CanPlaceFlowersTest {

  private final CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();

  @Test
  void canPlaceFlowers() {
    assertThat(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)).isEqualTo(Boolean.TRUE);
    assertThat(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)).isEqualTo(Boolean.FALSE);
  }
}
