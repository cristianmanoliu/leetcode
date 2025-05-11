package io.github.cristianmanoliu.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.cristianmanoliu.queue.RecentCounter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecentCounterTest {

  private RecentCounter recentCounter;

  @BeforeEach
  void setUp() {
    recentCounter = new RecentCounter();
  }

  @Test
  void ping() {
    recentCounter.ping(1);
    recentCounter.ping(100);
    recentCounter.ping(3001);
    assertEquals(1, recentCounter.ping(6002));
  }
}