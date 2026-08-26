/*
Sqrt(x) problem
Given a non-negative integer x, return the square root of x rounded down to the nearest integer, without 
using any built-in exponent or power function/operator.
Difficulty: Easy
Time Complexity O(sqrt(n))
Space Complexity O(1)
*/

public class Sqrt {
    public int mySqrt(int x) {
        int n = 1;
        boolean loop = true;
        while (loop) {  
            int result = n * n;
            if (result == x) {
                loop = false;
            }
            if (result > x) {
                n--;
                loop = false;
            }
            n++;
        }
        return n - 1;
    }
}
