package io.github.cristianmanoliu.two_pointers;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.cristianmanoliu.two_pointers.ContainerWithMostWater;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

  private final ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

  @Test
  void maxArea() {
    assertThat(containerWithMostWater.maxArea(new int[]{2, 3, 10, 5, 7, 8, 9})).isEqualTo(36);
    assertThat(containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})).isEqualTo(49);
    assertThat(containerWithMostWater.maxArea(new int[]{1, 1})).isEqualTo(1);
  }

}