import PlainOldJavaObject.ListNode;

/*
Given the head of a sorted linked list, delete all duplicates so each element appears only once. 
Return the linked list, still sorted.
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(1)
*/

public class RemoveDuplicatesFromSortedListCorrection {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE); ListNode tail = dummy;
        while (head != null) {
            if (tail.val == head.val) {
                head = head.next;
                if (head == null) tail.next = null;
            } else {
                tail.next = head;
                tail = tail.next;
                head = head.next;
            }
        }
        return dummy.next;
    }
}