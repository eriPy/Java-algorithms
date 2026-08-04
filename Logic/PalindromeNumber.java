/*
Palindrome Number problem
Given an integer x, determine whether it reads the same forwards and backwards 
(i.e., whether it is a palindrome), without converting it to a string type explicitly for 
comparison logic (solved via character-by-character two-pointer comparison).
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(1)
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String convetToString = String.valueOf(x);
        int total = convetToString.length();
        int index = total - 1;
        int mitad = index / 2 + 1;
        boolean value = true;
        for (int i = 0; i < convetToString.length(); i++) {
            value = convetToString.charAt(i) == convetToString.charAt(index);
            if (!value || i == mitad) {
                break;
            }
            index--;
        }
        return value;
    }
}
