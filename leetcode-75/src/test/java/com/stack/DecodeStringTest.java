package com.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DecodeStringTest {

  private final DecodeString underTest = new DecodeString();

  @Test
  public void decodeString() {
    assertEquals("aaabcbc", underTest.decodeString("3[a]2[bc]"));

  }
}