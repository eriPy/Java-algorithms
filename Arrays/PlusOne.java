/*
You are given a large integer represented as an array of digits (most significant digit first, no leading zeros). 
Increment the integer by one and return the resulting array of digits.
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(n)
*/

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            if (digits[i] > 9) {
                break;
            }
            System.arraycopy(digits, 0, result, 0, digits.length);
            result[i] = digits[i] / 10;
            result[i + 1] =  0;
            i--;
        }
        if (result[0] != 0) {
            return result;
        }
        return digits;
    }
}