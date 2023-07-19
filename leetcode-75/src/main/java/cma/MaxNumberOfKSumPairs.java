package cma;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {

  public int maxOperations(int[] nums, int k) {
    if (nums == null || nums.length <= 1) {
      return 0;
    }
    Arrays.sort(nums);

    int leftPointer = 0;
    int rightPointer = nums.length - 1;

    int countOfPairs = 0;
    while (leftPointer < rightPointer) {
      int leftNum = nums[leftPointer];
      int rightNum = nums[rightPointer];
      int currentSum = leftNum + rightNum;
      if (leftNum + rightNum == k) {
        countOfPairs++;
        leftPointer++;
        rightPointer--;
      } else {
        if (currentSum > k) {
          rightPointer--;
        } else {
          leftPointer++;
        }
      }
    }
    return countOfPairs;
  }
}
