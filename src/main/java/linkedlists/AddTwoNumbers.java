package linkedlists;

public class AddTwoNumbers extends ListNode {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode head = null;
    ListNode temp = null;
    int carry = 0;

    while (l1 != null && l2 != null) {

      if (head == null) {
        head = new ListNode((l1.val + l2.val + carry) % 10);
        temp = head;
      } else {
        temp.next = new ListNode((l1.val + l2.val + carry) % 10);
        temp = temp.next;
      }
      carry = (l1.val + l2.val + carry) / 10;

      l1 = l1.next;
      l2 = l2.next;
    }

    while (l1 != null) {

      if (head == null) {
        head = new ListNode((l1.val + carry) % 10);
        temp = head;
      } else {
        temp.next = new ListNode((l1.val + carry) % 10);
        temp = temp.next;
      }
      carry = (l1.val + carry) / 10;

      l1 = l1.next;
    }

    while (l2 != null) {

      if (head == null) {
        head = new ListNode((l2.val + carry) % 10);
        temp = head;
      } else {
        temp.next = new ListNode((l2.val + carry) % 10);
        temp = temp.next;
      }
      carry = (l2.val + carry) / 10;
      l2 = l2.next;
    }

    if (carry != 0) {
      temp.next = new ListNode(carry);
    }

    return head;
  }
}
