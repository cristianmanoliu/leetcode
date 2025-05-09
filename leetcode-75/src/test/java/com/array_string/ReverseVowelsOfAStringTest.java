package com.array_string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ReverseVowelsOfAStringTest {

  private final ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();

  @Test
  void reverseVowels() {
    assertThat(reverseVowelsOfAString.reverseVowels("hello")).isEqualTo("holle");
    assertThat(reverseVowelsOfAString.reverseVowels("leetcode")).isEqualTo("leotcede");
  }
}
