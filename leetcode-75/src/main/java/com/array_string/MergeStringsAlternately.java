package com.array_string;

public class MergeStringsAlternately {

  public String mergeAlternately(String word1, String word2) {
    if (word1 == null) {
      return word2;
    }
    if (word2 == null) {
      return word1;
    }
    int lenWord1 = word1.length();
    int lenWord2 = word2.length();
    int min = Math.min(lenWord1, lenWord2);

    StringBuilder result = new StringBuilder();
    for (int index = 0; index < min; index++) {
      result.append(word1.charAt(index));
      result.append(word2.charAt(index));
    }

    if (lenWord1 > lenWord2) {
      for (int index = min; index < lenWord1; index++) {
        result.append(word1.charAt(index));
      }
    } else {
      for (int index = min; index < lenWord2; index++) {
        result.append(word2.charAt(index));
      }
    }
    return result.toString();
  }
}
