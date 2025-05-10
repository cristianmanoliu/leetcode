package com.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveStarsFromAString {

  public String removeStars(String input) {
    if (input == null || input.trim().isEmpty()) {
      return input;
    }
    Deque<String> deque = new ArrayDeque<>();
    for (int i = 0; i < input.length(); i++) {
      String currentCharStr = String.valueOf(input.charAt(i));
      if ("*".equals(currentCharStr)) {
        deque.removeLast();
      } else {
        deque.addLast(currentCharStr);
      }
    }
    return String.join("", deque);
  }
}
