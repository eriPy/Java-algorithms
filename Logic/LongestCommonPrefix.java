/*
Longest Common Prefix problem
Write a function to find the longest common prefix string amongst an array of strings. 
If there is no common prefix, return an empty string "".
Difficulty: Easy
Time Complexity O(n * m)
Space Complexity O(1)
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String word = strs[0];
        for (String str: strs) {
            if (str.length() > word.length()) {
                str = str.substring(0, word.length());
            }
            getOut:
            for (int i = 0; i < str.length(); i++) {
                if (word.equals("")) {
                    break getOut;
                }
                if (word.charAt(i) != str.charAt(i)) {
                    word = word.substring(0, i);
                    break getOut;
                }
            }
        }
        return word;
    }
}
