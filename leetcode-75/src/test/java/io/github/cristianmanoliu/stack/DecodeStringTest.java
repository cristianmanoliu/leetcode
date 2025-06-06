package io.github.cristianmanoliu.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.cristianmanoliu.stack.DecodeString;
import org.junit.jupiter.api.Test;

class DecodeStringTest {

  private final DecodeString decodeString = new DecodeString();

  @Test
  void decodeString() {
    assertEquals("aaabcbc", decodeString.decodeString("3[a]2[bc]"));
  }
}