package io.github.cristianmanoliu.hashmap_set;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.cristianmanoliu.hashmap_set.FindTheDifferenceOfTwoArrays;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class FindTheDifferenceOfTwoArraysTest {

  private final FindTheDifferenceOfTwoArrays findTheDifferenceOfTwoArrays = new FindTheDifferenceOfTwoArrays();

  @Test
  void findDifference() {
    int[] nums1 = {1, 2, 3, 3};
    int[] nums2 = {2, 4, 4};
    List<List<Integer>> result = findTheDifferenceOfTwoArrays.findDifference(nums1, nums2);

    assertTrue(result.get(0).containsAll(Arrays.asList(1, 3)) && result.get(0).size() == 2);
    assertTrue(result.get(1).contains(4) && result.get(1).size() == 1);
  }
}