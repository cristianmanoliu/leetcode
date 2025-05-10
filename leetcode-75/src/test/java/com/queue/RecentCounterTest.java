package com.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecentCounterTest {

  private RecentCounter recentCounter;

  @BeforeEach
  void setUp() {
    recentCounter = new RecentCounter();
  }

  @Test
  void testSinglePing() {
    assertEquals(1, recentCounter.ping(1));
  }

  @Test
  void testMultiplePingsWithinWindow() {
    recentCounter.ping(1);
    recentCounter.ping(100);
    assertEquals(2, recentCounter.ping(100));
  }

  @Test
  void testSlidingWindowExpiresOldRequests() {
    recentCounter.ping(1);
    recentCounter.ping(100);
    recentCounter.ping(3001);
    assertEquals(1, recentCounter.ping(6002));
  }

  @Test
  void testEdgeOfWindowInclusive() {
    recentCounter.ping(3000);
    assertEquals(2, recentCounter.ping(6000));
  }
}