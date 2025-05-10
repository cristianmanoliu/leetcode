package com.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AsteroidCollisionTest {

  private final AsteroidCollision underTest = new AsteroidCollision();

  @Test
  public void asteroidCollision() {
    Assertions.assertArrayEquals(new int[]{10}, underTest.asteroidCollision(new int[]{10, 2, -5}));
    Assertions.assertArrayEquals(new int[]{5, 10}, underTest.asteroidCollision(new int[]{5, 10, -5}));
  }
}