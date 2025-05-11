package io.github.cristianmanoliu.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.cristianmanoliu.stack.RemoveStarsFromAString;
import org.junit.jupiter.api.Test;

class RemoveStarsFromAStringTest {

  private final RemoveStarsFromAString removeStarsFromAString = new RemoveStarsFromAString();

  @Test
  void removeStars() {
    assertEquals("lecoe", removeStarsFromAString.removeStars("leet**cod*e"));
  }
}