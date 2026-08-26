/*
Smallest Divisible Digit Product I problem
Given two integers n and t, return the smallest number greater than or equal to n whose digit product is divisible by t. 
Difficulty: Easy
Time Complexity: O(k * d)
Space Complexity: O(1)
*/

public class SmallestDivisibleDigitProductI {
    public int smallestNumber(int n, int t) {
        int product = 1;
        while (product % t != 0) {
            String value = String.valueOf(n);
            for (int i = 0; i < value.length(); i++) product *= Character.getNumericValue(value.charAt(i));
            if (product % t == 0) break;
            n++; product = 1;
        }
        return n;
    }
}