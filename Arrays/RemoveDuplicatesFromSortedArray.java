/*
Remove Duplicates From Sorted Array problem
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place so each unique element appears 
only once, keeping relative order. Return k, the number of unique elements — the first k positions of nums must hold the unique values 
in order (elements beyond index k-1 can be anything).
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(1)
*/

public class RemoveDuplicatesFromSortedArray {
    public int RemoveDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
