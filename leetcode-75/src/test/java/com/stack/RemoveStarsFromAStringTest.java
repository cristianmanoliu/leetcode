package com.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveStarsFromAStringTest {

  private final RemoveStarsFromAString removeStarsFromAString = new RemoveStarsFromAString();

  @Test
  void removeStars() {
    assertEquals("lecoe", removeStarsFromAString.removeStars("leet**cod*e"));
  }
}