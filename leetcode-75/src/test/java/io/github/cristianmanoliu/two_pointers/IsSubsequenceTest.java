package io.github.cristianmanoliu.two_pointers;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import io.github.cristianmanoliu.two_pointers.IsSubsequence;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {

  private final IsSubsequence isSubsequence = new IsSubsequence();

  @Test
  void isSubsequence() {
    assertThat(isSubsequence.isSubsequence("aaaaaa", "bbaaaa")).describedAs("aaaaaa in bbaaaa").isFalse();
    assertThat(isSubsequence.isSubsequence("abc", "ahbgdc")).describedAs("abc in ahbgdc").isTrue();
    assertThat(isSubsequence.isSubsequence("axc", "ahbgdc")).describedAs("axc in ahbgdc").isFalse();
  }
}