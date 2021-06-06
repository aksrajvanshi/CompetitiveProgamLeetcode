package linkedlists;

import org.junit.Assert;
import org.junit.Test;

public class TestAddTwoNumbers {

    @Test
    public void testAddTwoNumbers() {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);

        while (actual != null && expected != null) {
            Assert.assertEquals(expected.val, actual.val);

            expected = expected.next;
            actual = actual.next;
        }

        // testing both are null at this point
        Assert.assertEquals(expected, actual);

        l1 = new ListNode(1);
        l2 = new ListNode(9);
        expected = new ListNode(0);
        expected.next = new ListNode(1);

        actual = addTwoNumbers.addTwoNumbers(l1, l2);

        while (actual != null && expected != null) {
            Assert.assertEquals(expected.val, actual.val);

            expected = expected.next;
            actual = actual.next;
        }
    }
}
