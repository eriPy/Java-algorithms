package HashMap;

import java.util.HashMap;
import java.util.Map;

/*
Roman to Integer problem
Given a string representing a Roman numeral, convert it to its integer value, accounting 
for the six subtractive notation cases (IV, IX, XL, XC, CD, CM).
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(1)
 */

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> nums = new HashMap<>(Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        ));
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i >= 1 && nums.get(s.charAt(i)) > nums.get(s.charAt(i - 1))) {
                total += nums.get(s.charAt(i)) - (2 * nums.get(s.charAt(i - 1)));
            } else {
                total += nums.get(s.charAt(i));
            }
        }
        return total;
    }
}
