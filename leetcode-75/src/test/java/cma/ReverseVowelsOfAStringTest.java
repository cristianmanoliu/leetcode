package cma;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseVowelsOfAStringTest {
  private final ReverseVowelsOfAString underTest = new ReverseVowelsOfAString();

  @Test
  public void reverseVowels() {
    assertThat(underTest.reverseVowels("hello")).isEqualTo("holle");
    assertThat(underTest.reverseVowels("leetcode")).isEqualTo("leotcede");
  }
}
