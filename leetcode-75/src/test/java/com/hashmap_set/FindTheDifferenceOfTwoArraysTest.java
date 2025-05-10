package com.hashmap_set;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FindTheDifferenceOfTwoArraysTest {

  private final FindTheDifferenceOfTwoArrays underTest = new FindTheDifferenceOfTwoArrays();

  @Test
  public void findDifference() {
    int[] nums1 = {1, 2, 3, 3};
    int[] nums2 = {2, 4, 4};
    List<List<Integer>> result = underTest.findDifference(nums1, nums2);

    assertTrue(result.get(0).containsAll(Arrays.asList(1, 3)) && result.get(0).size() == 2);
    assertTrue(result.get(1).contains(4) && result.get(1).size() == 1);
  }
}