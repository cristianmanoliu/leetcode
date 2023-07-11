package cma;

public class ProductOfArrayExceptSelf {

  public int[] productExceptSelf(int[] nums) {
    int length = nums.length;
    int[] leftProducts = new int[length];
    int[] rightProducts = new int[length];

    leftProducts[0] = 1;
    rightProducts[length - 1] = 1;

    for (int i = 1; i < length; i++) {
      leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
    }

    for (int i = length - 2; i >= 0; i--) {
      rightProducts[i] = nums[i + 1] * rightProducts[i + 1];
    }

    int[] productExceptSelf = new int[length];
    for (int i = 0; i < length; i++) {
      productExceptSelf[i] = leftProducts[i] * rightProducts[i];
    }
    return productExceptSelf;
  }
}
