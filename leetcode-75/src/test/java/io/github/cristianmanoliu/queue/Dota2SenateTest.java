package io.github.cristianmanoliu.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Dota2SenateTest {

  private final Dota2Senate dota2Senate = new Dota2Senate();

  @Test
  void predictPartyVictory() {
    assertEquals("Radiant", dota2Senate.predictPartyVictory("RD"));
    assertEquals("Dire", dota2Senate.predictPartyVictory("RDD"));
  }
}