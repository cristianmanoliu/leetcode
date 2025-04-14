package cma;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    private final MaxConsecutiveOnes underTest = new MaxConsecutiveOnes();

    @Test
    void longestOnes() {
        assertEquals(6, underTest.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
    }
}