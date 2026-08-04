package Arrays;

/*
Two Sum problem
Given an array of integers nums and an integer target, return the indices of the two numbers that 
add up to target. Each input has exactly one solution, and the same element cannot be used twice.
Difficulty: Easy
Time complexity O(n)
Space complexity O(1)
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                int sum = nums[i] + nums[i + 1];
                if (sum == target) {
                    result[0] = i;
                    result[1] = i + 1;
                }
            }
        }
        return result;
    }
}