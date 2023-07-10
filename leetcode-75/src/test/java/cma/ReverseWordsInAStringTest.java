package cma;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ReverseWordsInAStringTest {

  private final ReverseWordsInAString underTest = new ReverseWordsInAString();

  @Test
  public void reverseWords() {
    assertThat(underTest.reverseWords("the sky is blue")).isEqualTo("blue is sky the");
    assertThat(underTest.reverseWords("  hello world  ")).isEqualTo("world hello");
    assertThat(underTest.reverseWords("a good   example")).isEqualTo("example good a");
  }
}
