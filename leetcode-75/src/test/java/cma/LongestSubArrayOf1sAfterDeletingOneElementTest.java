package cma;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubArrayOf1sAfterDeletingOneElementTest {
    private LongestSubArrayOf1sAfterDeletingOneElement underTest = new LongestSubArrayOf1sAfterDeletingOneElement();

    @Test
    public void longestSubArray() {
        assertEquals(3, underTest.longestSubArray(new int[]{1, 1, 0, 1}));
        assertEquals(5, underTest.longestSubArray(new int[]{0,1,1,1,0,1,1,0,1}));
        assertEquals(2, underTest.longestSubArray(new int[]{1,1,1}));
    }
}