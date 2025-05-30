package io.github.cristianmanoliu.array_string;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.cristianmanoliu.array_string.ReverseWordsInAString;
import org.junit.jupiter.api.Test;

class ReverseWordsInAStringTest {

  private final ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();

  @Test
  void reverseWords() {
    assertThat(reverseWordsInAString.reverseWords("the sky is blue")).isEqualTo("blue is sky the");
    assertThat(reverseWordsInAString.reverseWords("  hello world  ")).isEqualTo("world hello");
    assertThat(reverseWordsInAString.reverseWords("a good   example")).isEqualTo("example good a");
  }
}
