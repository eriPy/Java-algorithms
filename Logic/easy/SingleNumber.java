import java.util.HashSet;

/*
Single Number problem
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num: nums) result ^= num;
        return result;
    }
}