package io.github.cristianmanoliu.array_string;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

  private int[] extraCandiesView;

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> result = new ArrayList<>(candies.length);
    extraCandiesView = new int[candies.length];
    for (int index = 0; index < candies.length; index++) {
      extraCandiesView[index] = candies[index] + extraCandies;
    }

    for (int i = 0; i < extraCandiesView.length; i++) {
      boolean indexResult = Boolean.TRUE;
      for (int j = 0; j < extraCandiesView.length; j++) {
        if (i != j) {
          if (extraCandiesView[i] < candies[j]) {
            indexResult = Boolean.FALSE;
            break;
          }
        }
      }
      result.add(i, indexResult);
    }
    return result;
  }
}
