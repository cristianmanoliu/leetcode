package cma;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CanPlaceFlowersTest {
  private final CanPlaceFlowers underTest = new CanPlaceFlowers();

  @Test
  public void canPlaceFlowers() {
    assertThat(underTest.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1)).isEqualTo(Boolean.TRUE);
    assertThat(underTest.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 2)).isEqualTo(Boolean.FALSE);
  }
}
