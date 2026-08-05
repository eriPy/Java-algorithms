/*
Merge Sorted Array problem
Given two sorted arrays, merge them into the first array while maintaining sorted order, using 
the extra space already available at the end of the first array.
Difficulty: Easy
Time Complexity O(n * (m * n))
Space Complexity O(1)
*/

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;
        int y = 0;
        while (y <= n - 1) {
            if (nums1[x] == 0 || nums1[x] > nums2[y]) {
                for (int i = nums1.length - 1; i >= x; i--) {
                    if (i - 1 >= 0) {
                        nums1[i] = nums1[i - 1];
                    }
                }
                nums1[x] = nums2[y];
                y++;
            }
            x++;
        }
    }
}