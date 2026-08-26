import java.util.Map;
import java.util.HashMap;

/*
Find the Largest Almost Missing Integer problem
You are given an integer array nums and an integer k. An integer x is almost missing from nums if x appears in exactly one 
subarray of size k within nums. Return the largest almost missing integer from nums. If no such integer exists, return -1.
A subarray is a contiguous sequence of elements within an array.
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class FindTheLargestAlmostMissingInteger {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> ocurrences = new HashMap<>();
        int last = nums.length - k;
        for (int i = 0; i < nums.length; i++) {
            if (k == nums.length) {
                ocurrences.put(nums[i], 1);
                continue;
            }
            if (i > last) {
                ocurrences.merge(nums[i], k - (i - last), Integer::sum); 
                continue;
            }
            if (i < k) {
                ocurrences.merge(nums[i], i + 1, Integer::sum); 
                continue;
            }
            ocurrences.merge(nums[i], k, Integer::sum);
        }
        if (ocurrences.size() == 1 && k == 1) return -1;
        int biggest = nums[0];
        for (Map.Entry<Integer, Integer> ocurrence: ocurrences.entrySet()) {
            Integer key = ocurrence.getKey();
            Integer value = ocurrence.getValue();
            if (value < ocurrences.get(biggest)) {
                biggest = key;
                continue;
            }
            if (value == ocurrences.get(biggest)) {
                biggest = biggest > key ? biggest : key;
                continue;
            }
        }
        if (ocurrences.get(biggest) > 1) return -1;
        return biggest;
    }
}