import PlainOldJavaObject.ListNode;

/*
Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse 
order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class AddTwoNumbers {
    public ListNode AddTwoNumbersSolution(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1); ListNode tail = dummy; int sum; int surplus = 0;
        while (l1 != null || l2 != null || surplus != 0) { 
            int val1 = (l1 != null) ? l1.val: 0;
            int val2 = (l2 != null) ? l2.val: 0;
            sum = val1 + val2 + surplus;
            surplus = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
}