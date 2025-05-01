package cma;

public class FindPivotIndex {

  public int pivotIndex(int[] nums) {
    long total = 0;
    for (int v : nums) {
      total += v;
    }

    long left = 0;
    for (int i = 0; i < nums.length; i++) {
      if (left == total - left - nums[i]) {
        return i;
      }
      left += nums[i];
    }
    return -1;
  }
}