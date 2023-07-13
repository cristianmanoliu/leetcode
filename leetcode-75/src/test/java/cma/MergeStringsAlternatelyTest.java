package cma;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MergeStringsAlternatelyTest {

  private final MergeStringsAlternately underTest = new MergeStringsAlternately();

  @Test
  public void mergeAlternately() {
    assertThat(underTest.mergeAlternately("abc", "pqr"))
        .as("abc and pqr is merged as apbqcr")
        .isEqualTo("apbqcr");
    assertThat(underTest.mergeAlternately("ab", "pqrs"))
        .as("ab and pqrs is merged as apbqrs")
        .isEqualTo("apbqrs");
    assertThat(underTest.mergeAlternately("abcd", "pq"))
        .as("abcd and pq is merged as apbqcd")
        .isEqualTo("apbqcd");
  }
}
