package io.github.cristianmanoliu.array_string;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.cristianmanoliu.array_string.ReverseVowelsOfAString;
import org.junit.jupiter.api.Test;

class ReverseVowelsOfAStringTest {

  private final ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();

  @Test
  void reverseVowels() {
    assertThat(reverseVowelsOfAString.reverseVowels("hello")).isEqualTo("holle");
    assertThat(reverseVowelsOfAString.reverseVowels("leetcode")).isEqualTo("leotcede");
  }
}
