package io.github.cristianmanoliu.array_string;

import java.util.Arrays;
import java.util.List;

public class ReverseWordsInAString {

  public String reverseWords(String s) {
    StringBuilder result = new StringBuilder();
    List<String> words = Arrays.stream(s.split(" ")).filter(w -> !"".equals(w.trim())).toList();
    for (int i = words.size() - 1; i >= 0; i--) {
      result.append(words.get(i));
      if (i > 0) {
        result.append(" ");
      }
    }
    return result.toString();
  }
}

