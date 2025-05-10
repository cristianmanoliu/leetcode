package com.array_string;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class KidsWithTheGreatestNumberOfCandiesTest {

  private final KidsWithTheGreatestNumberOfCandies kidsWithTheGreatestNumberOfCandies = new KidsWithTheGreatestNumberOfCandies();

  @Test
  void kidsWithCandies() {
    assertThat(kidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3)).isEqualTo(
        List.of(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.FALSE, Boolean.TRUE));
  }
}
