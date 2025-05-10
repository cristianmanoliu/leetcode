package com.array_string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {

  private final ProductOfArrayExceptSelf underTest = new ProductOfArrayExceptSelf();

  @Test
  public void productExceptSelf() {
    assertThat(underTest.productExceptSelf(new int[]{1, 2, 3, 4}))
        .isEqualTo(new int[]{24, 12, 8, 6});
  }

}