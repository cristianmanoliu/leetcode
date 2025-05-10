package cma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveStarsFromAStringTest {

  private final RemoveStarsFromAString underTest = new RemoveStarsFromAString();

  @Test
  public void removeStars() {
    assertEquals("lecoe", underTest.removeStars("leet**cod*e"));
  }
}