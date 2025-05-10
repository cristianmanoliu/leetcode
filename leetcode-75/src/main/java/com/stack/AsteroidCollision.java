package com.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {

  public int[] asteroidCollision(int[] asteroids) {
    Deque<Integer> stack = new ArrayDeque<>();
    for (int ast : asteroids) {
      boolean keepChecking = true;
      while (keepChecking && ast < 0 && !stack.isEmpty() && stack.peek() > 0) {
        int top = stack.peek();
        if (top < -ast) {
          stack.pop();
        } else if (top == -ast) {
          stack.pop();
          keepChecking = false;
        } else {
          keepChecking = false;
        }
      }
      if (keepChecking) {
        stack.push(ast);
      }
    }
    int n = stack.size();
    int[] result = new int[n];
    for (int i = n - 1; i >= 0; i--) {
      result[i] = stack.pop();
    }
    return result;
  }
}