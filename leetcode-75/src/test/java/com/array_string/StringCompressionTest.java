package com.array_string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StringCompressionTest {

  private final StringCompression underTest = new StringCompression();

  @Test
  public void compress() {
    assertThat(underTest.compress(new char[]{'a', 'b', 'b', 'c', 'c', 'c'})).isEqualTo(5);
    assertThat(underTest.compress(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'})).isEqualTo(6);
    assertThat(underTest.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'})).isEqualTo(4);
    assertThat(underTest.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'})).isEqualTo(6);
    assertThat(underTest.compress(new char[]{'a'})).isEqualTo(1);
    assertThat(underTest.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'})).isEqualTo(4);
    assertThat(underTest.compress(new char[]{'a', 'b', 'c'})).isEqualTo(3);
  }
}