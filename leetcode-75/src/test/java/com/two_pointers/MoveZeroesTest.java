package com.two_pointers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MoveZeroesTest {

  private final MoveZeroes moveZeroes = new MoveZeroes();

  @Test
  void moveZeroes() {
    int[] testArr = new int[]{0, 1, 0, 3, 12};
    moveZeroes.moveZeroes(testArr);
    assertThat(testArr).isEqualTo(new int[]{1, 3, 12, 0, 0});
  }

}