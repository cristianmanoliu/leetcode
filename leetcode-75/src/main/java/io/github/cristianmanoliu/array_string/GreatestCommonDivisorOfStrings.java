package io.github.cristianmanoliu.array_string;

public class GreatestCommonDivisorOfStrings {

  private String gcdOfStringsInternal(String toCheck, String checkAgainst) {
    String gcd = "";
    for (int index = 1; index <= toCheck.length(); index++) {
      String candidate = toCheck.substring(0, index);
      if (canBuild(candidate, toCheck) && canBuild(candidate, checkAgainst)) {
        gcd = candidate;
      }
    }
    return gcd;
  }

  public boolean canBuild(String with, String target1) {
    String tmp = "";
    while (true) {
      tmp += with;
      if (target1.equals(tmp)) {
        return true;
      }

      if (tmp.length() > target1.length()) {
        break;
      }
    }
    return false;
  }

  public String gcdOfStrings(String str1, String str2) {
    if (str1 == null || str2 == null) {
      return "";
    }
    if (str1.length() < str2.length()) {
      return gcdOfStringsInternal(str1, str2);
    } else {
      return gcdOfStringsInternal(str2, str1);
    }
  }
}
