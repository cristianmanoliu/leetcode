package io.github.cristianmanoliu.linked_list;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class DeleteTheMiddleNodeOfALinkedListTest {

  private final DeleteTheMiddleNodeOfALinkedList deleteMiddle = new DeleteTheMiddleNodeOfALinkedList();

  @Test
  void testDeleteMiddle_MultipleNodes() {
    ListNode head = ListNodeTestUtils.arrayToList(new int[]{1, 2, 3, 4});
    ListNode result = deleteMiddle.deleteMiddle(head);
    assertArrayEquals(new int[]{1, 2, 4}, ListNodeTestUtils.listToArray(result));
  }

  @Test
  void testDeleteMiddle_SingleNode() {
    ListNode head = ListNodeTestUtils.arrayToList(new int[]{1});
    ListNode result = deleteMiddle.deleteMiddle(head);
    assertNull(result);
  }

  @Test
  void testDeleteMiddle_TwoNodes() {
    ListNode head = ListNodeTestUtils.arrayToList(new int[]{1, 2});
    ListNode result = deleteMiddle.deleteMiddle(head);
    assertArrayEquals(new int[]{1}, ListNodeTestUtils.listToArray(result));
  }

  @Test
  void testDeleteMiddle_ThreeNodes() {
    ListNode head = ListNodeTestUtils.arrayToList(new int[]{1, 2, 3});
    ListNode result = deleteMiddle.deleteMiddle(head);
    assertArrayEquals(new int[]{1, 3}, ListNodeTestUtils.listToArray(result));
  }

  @Test
  void testDeleteMiddle_EmptyList() {
    ListNode result = deleteMiddle.deleteMiddle(null);
    assertNull(result);
  }
}