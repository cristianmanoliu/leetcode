package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class RecentCounter {

  private final Deque<Integer> queue;

  public RecentCounter() {
    queue = new ArrayDeque<>();
  }

  public int ping(int t) {
    queue.addLast(t);
    while (queue.peekFirst() < t - 3000) {
      queue.removeFirst();
    }
    return queue.size();
  }
}