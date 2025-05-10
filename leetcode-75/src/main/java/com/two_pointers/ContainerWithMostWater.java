package com.two_pointers;

public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    if (height == null || height.length < 2) {
      return 0;
    }

    int left = 0;
    int right = height.length - 1;

    int maxArea = 0;
    while (left < right) {
      int candidateMaxArea = (right - left) * Math.min(height[left], height[right]);
      if (candidateMaxArea > maxArea) {
        maxArea = candidateMaxArea;
      }
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return maxArea;
  }
}
