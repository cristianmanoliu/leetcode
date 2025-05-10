package com.two_pointers;

public class MoveZeroes {

  public void moveZeroes(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int leftNumber = nums[i];
      if (leftNumber == 0) {
        for (int j = i + 1; j < nums.length; j++) {
          int rightNumber = nums[j];
          if (rightNumber != 0) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            break;
          }
        }
      }
    }

  }

}
