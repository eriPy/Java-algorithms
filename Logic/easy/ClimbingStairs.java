/*
Climbing Stairs problem
You are climbing a staircase that takes n steps to reach the top. Each time you can climb 1 or 2 steps. 
Return the number of distinct ways you can climb to the top.
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(1)
*/

class Solution {
    public int climbStairs(int n) {
        int total = 0;
        int turn = 1;
        int ultimo = 0;
        int penultimo = 0;
        while (turn < n + 1) {
            penultimo = ultimo;
            if (turn == 2) {
                total++;
            } else if (turn == 1) {
                total++;
            }
            ultimo = total;
            total = ultimo + penultimo;
            turn++;
        }
        return ultimo;
    }
}