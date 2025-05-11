package io.github.cristianmanoliu.hashmap_set;

import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {

  public int equalPairs(int[][] grid) {
    int n = grid.length;
    Map<String, Integer> rowFreq = new HashMap<>();
    for (int[] row : grid) {
      String key = buildKey(row);
      rowFreq.merge(key, 1, Integer::sum);
    }
    int pairs = 0;
    for (int c = 0; c < n; c++) {
      int[] col = new int[n];
      for (int r = 0; r < n; r++) {
        col[r] = grid[r][c];
      }
      String key = buildKey(col);
      pairs += rowFreq.getOrDefault(key, 0);
    }
    return pairs;
  }

  private String buildKey(int[] arr) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      if (i > 0) {
        sb.append(',');
      }
      sb.append(arr[i]);
    }
    return sb.toString();
  }
}
