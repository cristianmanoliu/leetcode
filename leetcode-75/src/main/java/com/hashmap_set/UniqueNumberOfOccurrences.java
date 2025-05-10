package com.hashmap_set;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

  public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> numberToOccurrences = new HashMap<>();
    Arrays.stream(arr).forEach(i -> {
      if (numberToOccurrences.containsKey(i)) {
        numberToOccurrences.put(i, numberToOccurrences.get(i) + 1);
      } else {
        numberToOccurrences.put(i, 1);
      }
    });

    Collection<Integer> allValues = numberToOccurrences.values();
    Set<Integer> uniqueValues = new HashSet<>(allValues);
    return allValues.size() == uniqueValues.size();
  }
}
