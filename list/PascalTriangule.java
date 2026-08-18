package list;

import java.util.ArrayList;
import java.util.List;

/*
Pascal's Triangle
Given an integer `numRows`, return the first `numRows` rows of Pascal's triangle.
Each row starts and ends with `1`, while every inner element is calculated
as the sum of the two elements directly above it.
Difficulty: easy
Time Complexity O(n^2)
Space Complexity O(n^2)
*/

class PascalTriangule {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangule = new ArrayList<>();
        int actual = 1;
        while (actual <= numRows) {
            List<Integer> turn = new ArrayList<>();
            int left = 0; int right = 1; int position = 1;
            for (int i = 0; i < actual; i++) {
                int base = triangule.size();
                if (base < 2 || turn.size() < 2) {
                    turn.add(1);
                    continue;
                }
                List<Integer> reference = triangule.get(triangule.size() - 1);
                turn.add(position, reference.get(left) + reference.get(right));
                left++; right++; position++;
            }
            actual++;
            triangule.add(new ArrayList<>(turn));
            turn.clear();
        }
        return triangule; 
    }
}