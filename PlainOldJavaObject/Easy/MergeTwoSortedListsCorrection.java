import PlainOldJavaObject.ListNode;

/*
Merge Two Sorted List problem
You are given the heads of two sorted linked lists. Merge them into one sorted list by splicing together the existing nodes, and 
return the head of the merged list.
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(1)
*/

public class MergeTwoSortedListsCorrection {
    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); ListNode tail = dummy;
        while (list1 != null || list2 != null) {
            if (list1 != null ^ list2 != null) {
                tail.next = (list1 == null) ? list2: list1;
                tail = tail.next;
                if (list1 != null) {list1 = list1.next;} else {list2 = list2.next;}
                continue;
            }
            int value = (list1.val <= list2.val) ? list1.val: list2.val;
            tail.next = (value == list1.val) ? list1: list2;
            tail = tail.next;
            if (value == list1.val) {
                list1 = list1.next;
                continue;
            }
            list2 = list2.next;
        }
        return dummy.next;
    }
}