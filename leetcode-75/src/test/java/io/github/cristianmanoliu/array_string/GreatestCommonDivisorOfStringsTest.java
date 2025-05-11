package io.github.cristianmanoliu.array_string;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.cristianmanoliu.array_string.GreatestCommonDivisorOfStrings;
import org.junit.jupiter.api.Test;

class GreatestCommonDivisorOfStringsTest {

  private final GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings = new GreatestCommonDivisorOfStrings();

  @Test
  void gcdOfStrings() {
    assertThat(greatestCommonDivisorOfStrings.gcdOfStrings("ABCABC", "ABC")).as("GCDOS between ABCABC and ABC is ABC").isEqualTo("ABC");
    assertThat(greatestCommonDivisorOfStrings.gcdOfStrings("ABABAB", "ABAB")).as("GCDOS between ABABAB and ABAB is ABAB").isEqualTo("AB");
    assertThat(greatestCommonDivisorOfStrings.gcdOfStrings("LEET", "CODE")).as("GCDOS between LEET and CODE is empty string").isEqualTo("");
  }
}
