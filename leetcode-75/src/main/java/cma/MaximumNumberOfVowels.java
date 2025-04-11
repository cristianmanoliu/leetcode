package cma;

public class MaximumNumberOfVowels {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                maxVowels++;
            }
        }
        int windowSize = maxVowels;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i)) && !isVowel(s.charAt(i - k))) {
                windowSize++;
            }
            if (!isVowel(s.charAt(i)) && isVowel(s.charAt(i - k))) {
                windowSize--;
            }
            maxVowels = Math.max(maxVowels, windowSize);
        }
        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
