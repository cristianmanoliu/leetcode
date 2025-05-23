package io.github.cristianmanoliu.uncategorized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : nums) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
      heap.offer(entry);
      if (heap.size() > k) {
        heap.poll();
      }
    }

    List<Integer> result = new ArrayList<>();
    while (!heap.isEmpty()) {
      result.add(heap.poll().getKey());
    }

    Collections.reverse(result);

    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
