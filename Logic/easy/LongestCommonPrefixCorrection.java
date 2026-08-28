/*
Longest Common Prefix problem
Write a function to find the longest common prefix string amongst an array of strings. 
If there is no common prefix, return an empty string "".
Difficulty: Easy
Time Complexity O(n * m)
Space Complexity O(1)
 */

public class LongestCommonPrefixCorrection {
    public String longestCommonPrefix(String[] strs) {
        if (strs[0].isEmpty() || strs.length <= 1) return strs[0].isEmpty()? "": strs[0];
        int indexArray = 1; int indexString = 0; int index = -1;
        while (indexString < strs[0].length()) {
            if (indexArray == strs.length) {indexArray = 1; indexString++;}
            int value1 = (indexString < strs[0].length())? (int) strs[0].charAt(indexString): 0; 
            int value2 = (indexString < strs[indexArray].length())? (int) strs[indexArray].charAt(indexString): 0;
            if (value1 != value2) {index = indexString; break;}
            indexArray++;
        }
        return index < 0? strs[0]: strs[0].substring(0, index);
    }
}