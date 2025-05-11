package io.github.cristianmanoliu.stack;

import java.util.Stack;

public class DecodeString {

  public String decodeString(String encodedString) {
    Stack<Integer> countStack = new Stack<>();
    Stack<StringBuilder> stringStack = new Stack<>();
    StringBuilder current = new StringBuilder();
    int counterDigit = 0;
    for (char ch : encodedString.toCharArray()) {
      if (Character.isDigit(ch)) {
        counterDigit = counterDigit * 10 + (ch - '0');
      } else if (ch == '[') {
        countStack.push(counterDigit);
        stringStack.push(current);
        counterDigit = 0;
        current = new StringBuilder();
      } else if (ch == ']') {
        int repeat = countStack.pop();
        StringBuilder previous = stringStack.pop();
        previous.append(String.valueOf(current).repeat(Math.max(0, repeat)));
        current = previous;
      } else {
        current.append(ch);
      }
    }
    return current.toString();
  }
}
