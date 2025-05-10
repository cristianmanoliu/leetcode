package com.two_pointers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

  private final ContainerWithMostWater underTest = new ContainerWithMostWater();

  @Test
  public void maxArea() {
    assertThat(underTest.maxArea(new int[]{2, 3, 10, 5, 7, 8, 9})).isEqualTo(36);
    assertThat(underTest.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})).isEqualTo(49);
    assertThat(underTest.maxArea(new int[]{1, 1})).isEqualTo(1);
  }

}