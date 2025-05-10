package com.array_string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorOfStringsTest {

  private final GreatestCommonDivisorOfStrings underTest = new GreatestCommonDivisorOfStrings();

  @Test
  public void gcdOfStrings() {
    assertThat(underTest.gcdOfStrings("ABCABC", "ABC"))
        .as("GCDOS between ABCABC and ABC is ABC")
        .isEqualTo("ABC");
    assertThat(underTest.gcdOfStrings("ABABAB", "ABAB"))
        .as("GCDOS between ABABAB and ABAB is ABAB")
        .isEqualTo("AB");
    assertThat(underTest.gcdOfStrings("LEET", "CODE"))
        .as("GCDOS between LEET and CODE is empty string")
        .isEqualTo("");
  }
}
