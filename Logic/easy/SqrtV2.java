/*
Sqrt(x) problem
Given a non-negative integer x, return the square root of x rounded down to the nearest integer, without 
using any built-in exponent or power function/operator.
Difficulty: Easy
Time Complexity O(sqrt(n)) worst case — hybrid approach: halves the search range when the candidate 
overshoots, but still increments by 1 when it undershoots
Space Complexity O(1)
*/

public class SqrtV2 {
    public int mySqrt(int x) {
        long z = (long) x;
        long n = x / 2;
        long next = n + 1;
        while (((n * n) <= z) ^ (z < (next * next))) {
            if ((n * n) > (z)) {
                n = (n - 1) / 2;
                next = n + 1;
            }
            if ((next * next) <= z) {
                n++;
                next = n + 1;
            }
        }
        return (int) n;
    }
}