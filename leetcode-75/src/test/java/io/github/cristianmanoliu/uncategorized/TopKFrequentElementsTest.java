package io.github.cristianmanoliu.uncategorized;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TopKFrequentElementsTest {

  private TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

  @Test
  void topKFrequentExample_1() {
    int[] inputElements = new int[]{1, 1, 1, 2, 2, 3};
    int inputK = 2;

    int[] expected = new int[]{1, 2};
    int[] actual = topKFrequentElements.topKFrequent(inputElements, inputK);

    assertArrayEquals(expected, actual);
  }

  @Test
  void topKFrequentExample_2() {
    int[] inputElements = new int[]{1};
    int inputK = 1;

    int[] expected = new int[]{1};
    int[] actual = topKFrequentElements.topKFrequent(inputElements, inputK);

    assertArrayEquals(expected, actual);
  }
}