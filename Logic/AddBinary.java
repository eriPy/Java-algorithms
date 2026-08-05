/*
Add Binary problem
Given two binary strings a and b, return their sum as a binary string.
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(1)
*/

public class AddBinary {
    public String addBinary(String a, String b) {
        int valueA = a.length() - 1;
        int valueB = b.length() - 1;
        int n = 0;
        int totalA = 0;
        int totalB = 0;
        while (valueA >= 0 && valueB >= 0) {
            if (valueA >= 0) {
                if (a.charAt(valueA) == '1') {
                    totalA += 1 << n;
                }
                valueA--;
            }
            if (valueB >= 0) {
                if (b.charAt(valueB) == '1') {
                    totalB += 1 << n;
                }
                valueB--;
            }
            n++;
        }
        n = 0;
        int total = totalA + totalB;
        return Integer.toBinaryString(total);
    }
}
