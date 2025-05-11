package io.github.cristianmanoliu.array_string;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.cristianmanoliu.array_string.MergeStringsAlternately;
import org.junit.jupiter.api.Test;

public class MergeStringsAlternatelyTest {

  private final MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();

  @Test
  void mergeAlternately() {
    assertThat(mergeStringsAlternately.mergeAlternately("abc", "pqr")).as("abc and pqr is merged as apbqcr").isEqualTo("apbqcr");
    assertThat(mergeStringsAlternately.mergeAlternately("ab", "pqrs")).as("ab and pqrs is merged as apbqrs").isEqualTo("apbqrs");
    assertThat(mergeStringsAlternately.mergeAlternately("abcd", "pq")).as("abcd and pq is merged as apbqcd").isEqualTo("apbqcd");
  }
}
