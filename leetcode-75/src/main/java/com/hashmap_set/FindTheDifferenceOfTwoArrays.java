package com.hashmap_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {

  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    for (int num : nums1) {
      set1.add(num);
    }
    Set<Integer> set2 = new HashSet<>();
    for (int num : nums2) {
      set2.add(num);
    }

    List<Integer> onlyIn1 = new ArrayList<>();
    List<Integer> onlyIn2 = new ArrayList<>();

    for (int num : set1) {
      if (!set2.contains(num)) {
        onlyIn1.add(num);
      }
    }

    for (int num : set2) {
      if (!set1.contains(num)) {
        onlyIn2.add(num);
      }
    }

    return Arrays.asList(onlyIn1, onlyIn2);
  }
}
