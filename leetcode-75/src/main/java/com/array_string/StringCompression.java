package com.array_string;

public class StringCompression {

  public int compress(char[] chars) {
    if (chars == null || chars.length == 0) {
      return 0;
    }
    if (chars.length == 1) {
      return 1;
    }
    int newCompressedArrIndex = 0;
    char lastSeenCh = chars[0];
    int currentCountForLastSeenCh = 1;

    for (int i = 1; i < chars.length; i++) {
      boolean hasNextChar = (i + 1) != chars.length;
      char currentCh = chars[i];
      if (lastSeenCh == currentCh) {
        currentCountForLastSeenCh++;
      } else {
        newCompressedArrIndex = getNewCompressedArrIndex(chars, newCompressedArrIndex, lastSeenCh, currentCountForLastSeenCh);
        lastSeenCh = currentCh;
        currentCountForLastSeenCh = 1;
      }

      if (!hasNextChar) {
        newCompressedArrIndex = getNewCompressedArrIndex(chars, newCompressedArrIndex, lastSeenCh, currentCountForLastSeenCh);
      }
    }

    return newCompressedArrIndex;
  }

  private int getNewCompressedArrIndex(char[] chars, int newCompressedArrIndex, char lastSeenCh, int currentCountForLastSeenCh) {
    chars[newCompressedArrIndex++] = lastSeenCh;
    if (currentCountForLastSeenCh > 1) {
      String currentRepStr = String.valueOf(currentCountForLastSeenCh);
      for (char ch : currentRepStr.toCharArray()) {
        chars[newCompressedArrIndex++] = ch;
      }
    }
    return newCompressedArrIndex;
  }
}
