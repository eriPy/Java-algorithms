package PlainOldJavaObject;

/*
Merge Two Sorted List problem
You are given the heads of two sorted linked lists. Merge them into one sorted list by splicing together the existing nodes, and 
return the head of the merged list.
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(1)
*/

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); 
        ListNode tail = dummy; 
        ListNode current1 = list1; ListNode current2 = list2; ListNode next;
        while (current1 != null && current2 != null) {
            if (current1.val <= current2.val) {
                tail.next = current1;
                current1 = current1.next;
            } else {
                tail.next = current2;
                current2 = current2.next;
            }
            tail = tail.next;
        }
        if (current1 == null || current2 == null) {
                next = (current1 != null) ? current1: current2;
                while (next != null) {
                    tail.next = next;
                    next = next.next;
                }
                tail = tail.next;
            } 
        return dummy.next;
    }
}