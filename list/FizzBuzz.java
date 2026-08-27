import java.util.ArrayList;
import java.util.List;

/*
Fizz Buzz problem
Given an integer n, return a string array answer (1-indexed) where:
answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> fb = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            fb.add(
                i % 15 == 0 ? "FizzBuzz":
                i % 3 == 0 ? "Fizz":
                i % 5 == 0? "Buzz":
                String.valueOf(i)
            );
        }
        return fb;
    }
}