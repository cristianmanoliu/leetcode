package io.github.cristianmanoliu.linked_list;

public class ListNodeTestUtils {

  public static ListNode arrayToList(int[] arr) {
    if (arr == null) {
      return null;
    }
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    for (int val : arr) {
      curr.next = new ListNode(val);
      curr = curr.next;
    }
    return dummy.next;
  }

  public static int[] listToArray(ListNode head) {
    java.util.List<Integer> list = new java.util.ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}
