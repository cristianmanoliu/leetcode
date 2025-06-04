package io.github.cristianmanoliu.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Dota2Senate {

  public String predictPartyVictory(String senate) {
    int n = senate.length();
    Queue<Integer> radiantQueue = new ArrayDeque<>();
    Queue<Integer> direQueue = new ArrayDeque<>();

    for (int i = 0; i < n; i++) {
      if (senate.charAt(i) == 'R') {
        radiantQueue.offer(i);
      } else {
        direQueue.offer(i);
      }
    }

    while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
      int iR = radiantQueue.poll();
      int iD = direQueue.poll();
      if (iR < iD) {
        radiantQueue.offer(iR + n);
      } else {
        direQueue.offer(iD + n);
      }
    }

    return radiantQueue.isEmpty() ? "Dire" : "Radiant";
  }
}
