package cma;

public class CanPlaceFlowers {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if (n == 0) {
      return true;
    }

    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] != 1) {
        if ((i - 1 < 0 || flowerbed[i - 1] == 0)
            && (i + 1 >= flowerbed.length || flowerbed[i + 1] == 0)) {
          flowerbed[i] = 1;
          return canPlaceFlowers(flowerbed, n - 1);
        }
      }
    }
    return false;
  }
}
