import java.util.HashSet;
import java.util.Set;

/*
Smallest Missing Multiple of K problem
Given an integer array nums and an integer k, return the smallest positive multiple of k that is missing from nums.
A multiple of k is any positive integer divisible by k.
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class SmallestMissingMultipleofK {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> multiples = new HashSet<>(); int x = 0; int n = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0) {
                multiples.add(nums[i]);
            }
        }
        while (x == 0) {
            if (n % k == 0 && !multiples.contains(n)) {
                x = n;
            }
            n++;
        }
        return x;
    }
}
