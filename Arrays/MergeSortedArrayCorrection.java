/*
Merge Sorted Array problem
Given two sorted arrays, merge them into the first array while maintaining sorted order, using 
the extra space already available at the end of the first array.
Difficulty: Easy
Time Complexity O(m + n)
Space Complexity O(1)
*/

public class MergeSortedArrayCorrection {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pstn = m + n - 1;
        while (n > 0) {
            if (m == 0 || nums1[m - 1] < nums2[n - 1]) {
                nums1[pstn] = nums2[n - 1]; n--;
            } else if (nums1[m -1] >= nums2[n - 1]) {
                nums1[pstn] = nums1[m - 1]; m--;
            }
            pstn--;
        } 
    }
}