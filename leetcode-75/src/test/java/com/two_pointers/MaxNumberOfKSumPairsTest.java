package com.two_pointers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MaxNumberOfKSumPairsTest {

  private final MaxNumberOfKSumPairs maxNumberOfKSumPairs = new MaxNumberOfKSumPairs();

  @Test
  void maxOperations() {
    assertThat(maxNumberOfKSumPairs.maxOperations(new int[]{2, 2, 2, 3, 1, 1, 4, 1}, 4)).isEqualTo(2);
    assertThat(maxNumberOfKSumPairs.maxOperations(new int[]{1, 2, 3, 4}, 5)).isEqualTo(2);
    assertThat(maxNumberOfKSumPairs.maxOperations(new int[]{3, 1, 3, 4, 3}, 6)).isEqualTo(1);
  }
}