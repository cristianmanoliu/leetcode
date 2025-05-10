package com.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DecodeStringTest {

  private final DecodeString decodeString = new DecodeString();

  @Test
  void decodeString() {
    assertEquals("aaabcbc", decodeString.decodeString("3[a]2[bc]"));
  }
}