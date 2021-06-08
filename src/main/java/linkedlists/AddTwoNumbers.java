/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are
 * stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and
 * return the sum as a linked list.
 *
 * <p>You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
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
