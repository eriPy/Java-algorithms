package PlainOldJavaObject;

/*
Given the head of a sorted linked list, delete all duplicates so each element appears only once. 
Return the linked list, still sorted.
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(1)
*/

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1); ListNode tail = dummy; ListNode list = head; ListNode now = new ListNode();
        while (list != null) {
            if (now.val == list.val) {
                list = list.next;
                if (list == null) {
                    tail.next = null;
                }
            } else {
                tail.next = list;
                now = list;
                list = list.next;
                tail = tail.next;
            }
        }
        return dummy.next;
    }
}
