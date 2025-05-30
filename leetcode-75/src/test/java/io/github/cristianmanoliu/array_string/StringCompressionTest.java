package io.github.cristianmanoliu.array_string;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.cristianmanoliu.array_string.StringCompression;
import org.junit.jupiter.api.Test;

class StringCompressionTest {

  private final StringCompression stringCompression = new StringCompression();

  @Test
  void compress() {
    assertThat(stringCompression.compress(new char[]{'a', 'b', 'b', 'c', 'c', 'c'})).isEqualTo(5);
    assertThat(stringCompression.compress(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'})).isEqualTo(6);
    assertThat(stringCompression.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'})).isEqualTo(4);
    assertThat(stringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'})).isEqualTo(6);
    assertThat(stringCompression.compress(new char[]{'a'})).isEqualTo(1);
    assertThat(stringCompression.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'})).isEqualTo(4);
    assertThat(stringCompression.compress(new char[]{'a', 'b', 'c'})).isEqualTo(3);
  }
}