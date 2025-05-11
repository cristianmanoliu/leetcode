package io.github.cristianmanoliu.sliding_window;

public class LongestSubArrayOf1sAfterDeletingOneElement {

  public int longestSubArray(int[] nums) {
    int left = 0, zeros = 0, bestWindow = 0;
    for (int right = 0; right < nums.length; right++) {
      if (nums[right] == 0) {
        zeros++;
      }
      while (zeros > 1) {
        if (nums[left] == 0) {
          zeros--;
        }
        left++;
      }
      bestWindow = Math.max(bestWindow, right - left + 1);
    }
    return bestWindow - 1;
  }
}
