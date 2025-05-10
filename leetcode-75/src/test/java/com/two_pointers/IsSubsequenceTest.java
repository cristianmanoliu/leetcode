package com.two_pointers;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {

  private final IsSubsequence underTest = new IsSubsequence();

  @Test
  public void isSubsequence() {
    assertThat(underTest.isSubsequence("aaaaaa", "bbaaaa")).describedAs("aaaaaa in bbaaaa").isFalse();
    assertThat(underTest.isSubsequence("abc", "ahbgdc")).describedAs("abc in ahbgdc").isTrue();
    assertThat(underTest.isSubsequence("axc", "ahbgdc")).describedAs("axc in ahbgdc").isFalse();
  }
}