/*
Remove Element problem
Given an integer array nums and an integer val, remove all occurrences of val in-place. 
The order of elements may be changed. Return k, the number of elements not equal to val — the first 
k positions of nums must contain those elements (order doesn't matter, remaining positions are irrelevant).
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(1)
*/

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int right = nums.length - 1;
        int left = 0;
        while (left <= right) {
            if (nums[left] == val) {
                for (int total = right; total >= left; total--) {
                    if (nums[total] != val) {
                        nums[left] = nums[total];
                        right = total - 1;
                        break;
                    }
                }
            }
            k++;
            left++;
        }
        return k;
    }
}
