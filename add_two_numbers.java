
public /**
        * Definition for singly-linked list. public class ListNode { int val; ListNode
        * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
        * ListNode next) { this.val = val; this.next = next; } }
        */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(0);
        ListNode resultItr = resultHead;
        boolean carry = false;

        ListNode h1 = l1;
        ListNode h2 = l2;
        while (h1 != null || h2 != null) {
            int sum = 0;
            if (h1 == null) {
                sum += h2.val;
                h2 = h2.next;
            } else if (h2 == null) {
                sum += h1.val;
                h1 = h1.next;
            } else {
                sum += h1.val + h2.val;
                h1 = h1.next;
                h2 = h2.next;
            }

            if (carry) {
                sum++;
            }

            if (sum >= 10) {
                sum %= 10;
                carry = true;
            } else {
                carry = false;
            }

            ListNode newnode = new ListNode(sum);
            resultItr.next = newnode;
            resultItr = resultItr.next;

        }
        if (carry) {
            resultItr.next = new ListNode(1);
        }
        return resultHead.next;
    }
}