package io.github.cristianmanoliu.prefix_sum;

public class FindTheHighestAltitude {

  public int largestAltitude(int[] gain) {
    int maxAltitude = 0;
    int currentAltitude = 0;
    for (int g : gain) {
      currentAltitude += g;
      if (currentAltitude > maxAltitude) {
        maxAltitude = currentAltitude;
      }
    }
    return maxAltitude;
  }
}
