/*
Check Divisibility by Digit Sum and Product problem
Given a positive integer n, determine whether n is divisible by the sum of its digit sum and its digit product.
Difficulty: easy
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class CheckDivisibilitybyDigitSumandProduct {
    public boolean checkDivisibility(int n) {
        String number = String.valueOf(n); int value1 = 0; int value2 = 1;
        for (int i = 0; i < number.length(); i++) {
            value1 += Character.getNumericValue(number.charAt(i));
            value2 *= Character.getNumericValue(number.charAt(i));
        }
        return n % (value1 + value2) == 0;
    }
}