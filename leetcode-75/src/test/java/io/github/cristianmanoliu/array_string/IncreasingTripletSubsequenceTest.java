package io.github.cristianmanoliu.array_string;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import io.github.cristianmanoliu.array_string.IncreasingTripletSubsequence;
import org.junit.jupiter.api.Test;

class IncreasingTripletSubsequenceTest {

  private final IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();

  @Test
  void increasingTriplet() {
    assertThat(increasingTripletSubsequence.increasingTriplet(new int[]{1, 2, 3, 4, 5})).isEqualTo(true);
    assertThat(increasingTripletSubsequence.increasingTriplet(new int[]{5, 4, 3, 2, 1})).isEqualTo(false);
    assertThat(increasingTripletSubsequence.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6})).isEqualTo(true);
    assertThat(increasingTripletSubsequence.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13})).isEqualTo(true);
  }
}