package cma;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DetermineIfTwoStringsAreCloseTest {

  private final DetermineIfTwoStringsAreClose underTest = new DetermineIfTwoStringsAreClose();

  @Test
  public void closeStrings() {
    assertTrue(underTest.closeStrings("abc", "bca"), "'abc' and 'bca' should be close");
    assertFalse(underTest.closeStrings("a", "aa"), "'a' and 'aa' should not be close");
    assertTrue(underTest.closeStrings("cabbba", "abbccc"), "'cabbba' and 'abbccc' should be close");
  }
}