/*
Lenght Of Last Word problem
Given a string s consisting of words and spaces, return the length of the last word in the string.
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(n)
*/

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] parts = s.split(" ");
        return parts[parts.length - 1].length();
    }   
}
