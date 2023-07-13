package cma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseVowelsOfAString {

  private final Set<String> VOWELS = Set.of("A", "E", "I", "O", "U");

  public String reverseVowels(String s) {
    List<Integer> indexesToSwap = new ArrayList<>();
    List<Integer> reverseIndexesToSwap;

    char[] letters = s.toCharArray();
    for (int i = 0; i < letters.length; i++) {
      String letter = String.valueOf(letters[i]).toUpperCase();
      if (VOWELS.contains(letter)) {
        indexesToSwap.add(i);
      }
    }
    reverseIndexesToSwap = new ArrayList<>(indexesToSwap);
    Collections.reverse(reverseIndexesToSwap);

    Set<Integer> swappedIndexes = new HashSet<>();
    for (int i = 0; i < indexesToSwap.size(); i++) {
      if (swappedIndexes.contains(indexesToSwap.get(i))
          || swappedIndexes.contains(reverseIndexesToSwap.get(i))) {
        continue;
      }
      char tmp = letters[indexesToSwap.get(i)];
      letters[indexesToSwap.get(i)] = letters[reverseIndexesToSwap.get(i)];
      letters[reverseIndexesToSwap.get(i)] = tmp;
      swappedIndexes.add(indexesToSwap.get(i));
      swappedIndexes.add(reverseIndexesToSwap.get(i));
    }
    return new String(letters);
  }
}
