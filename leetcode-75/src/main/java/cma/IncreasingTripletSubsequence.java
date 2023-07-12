package cma;

public class IncreasingTripletSubsequence {

  public boolean increasingTriplet(int[] nums) {
    if (nums == null || nums.length < 3) {
      return false;
    }

    int[] lastKnownMax = new int[nums.length];
    int[] lastKnownMin = new int[nums.length];

    lastKnownMin[1] = nums[0];
    lastKnownMax[nums.length - 2] = nums[nums.length - 1];

    // min
    for (int i = 2; i < nums.length; i++) {
      int leftValue = nums[i - 1];
      int lastKnownMinValue = lastKnownMin[i - 1];
      if (leftValue < lastKnownMinValue) {
        lastKnownMin[i] = leftValue;
      } else {
        lastKnownMin[i] = lastKnownMinValue;
      }
    }

    // max
    for (int i = nums.length - 3; i > 0; i--) {
      int rightValue = nums[i + 1];
      int lastKnownMaxValue = lastKnownMax[i + 1];
      if (rightValue > lastKnownMaxValue) {
        lastKnownMax[i] = rightValue;
      } else {
        lastKnownMax[i] = lastKnownMaxValue;
      }
    }

    for (int i = 1; i < nums.length - 1; i++) {
      int curValue = nums[i];
      int minLeft = lastKnownMin[i];
      int maxRight = lastKnownMax[i];
      if (minLeft < curValue && curValue < maxRight) {
        return true;
      }
    }

    return false;
  }
}
