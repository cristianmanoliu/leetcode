package cma;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class IncreasingTripletSubsequenceTest {

  private final IncreasingTripletSubsequence underTest = new IncreasingTripletSubsequence();

  @Test
  void increasingTriplet() {
    assertThat(underTest.increasingTriplet(new int[]{1, 2, 3, 4, 5})).isEqualTo(true);
    assertThat(underTest.increasingTriplet(new int[]{5, 4, 3, 2, 1})).isEqualTo(false);
    assertThat(underTest.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6})).isEqualTo(true);
    assertThat(underTest.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13})).isEqualTo(true);
  }
}