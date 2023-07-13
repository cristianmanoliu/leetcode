package cma;

public class IsSubsequence {

  public boolean isSubsequence(String s, String t) {
    char[] left = s.toCharArray();
    char[] right = t.toCharArray();
    int leftCharsFoundInRight = 0;
    int lastFoundIndex = -1;
    for (int i = 0; i < left.length; i++) {
      char leftIteratorCh = left[i];
      for (int j = lastFoundIndex + 1; j < right.length; j++) {
        char rightIteratorCh = right[j];
        if (leftIteratorCh == rightIteratorCh) {
          leftCharsFoundInRight++;
          lastFoundIndex = j;
          break;
        }
      }
    }
    return leftCharsFoundInRight == left.length;
  }
}
