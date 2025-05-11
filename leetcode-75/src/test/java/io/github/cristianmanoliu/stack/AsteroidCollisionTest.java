package io.github.cristianmanoliu.stack;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import io.github.cristianmanoliu.stack.AsteroidCollision;
import org.junit.jupiter.api.Test;

public class AsteroidCollisionTest {

  private final AsteroidCollision asteroidCollision = new AsteroidCollision();

  @Test
  void asteroidCollision() {
    assertArrayEquals(new int[]{10}, asteroidCollision.asteroidCollision(new int[]{10, 2, -5}));
    assertArrayEquals(new int[]{5, 10}, asteroidCollision.asteroidCollision(new int[]{5, 10, -5}));
  }
}