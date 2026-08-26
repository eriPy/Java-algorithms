import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Find Missing Elements problem 
Given an array of unique integers containing every integer within a certain range except possibly some, where the 
smallest and largest of that range are guaranteed present, return a sorted list of all missing integers in the range.
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class FindMissingElements {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> rangeNums = new HashSet<>(); List<Integer> missingNums = new ArrayList<>();
        int lessThan = Integer.MAX_VALUE; int greaterThan = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) lessThan = nums[i];
            if (nums[i] < lessThan) lessThan = nums[i];
            if (nums[i] > greaterThan) greaterThan = nums[i];
            rangeNums.add(nums[i]);
        }
        for (int i = lessThan + 1; i < greaterThan; i++) {
            if (!rangeNums.contains(i)) missingNums.add(i);
        }
        return missingNums;
    }
}
