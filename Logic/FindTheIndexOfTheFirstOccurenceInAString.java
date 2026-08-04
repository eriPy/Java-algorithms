/*
Find the index of the first occurence in a string
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is 
not part of haystack.
Difficulty: Easy
Time Complexity O(n*m)
Space Complexity O(1)
*/

public class FindTheIndexOfTheFirstOccurenceInAString {
    public int strStr(String haystack, String needle) {
        int k = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                k = i;
                int x = 0;
                for (int j = i; j < needle.length(); j++) {
                    if (j == needle.length() - 1 && haystack.charAt(j) == needle.charAt(needle.length() - 1)) {
                        return k;
                    }
                    if (haystack.charAt(j) != needle.charAt(x)) {
                        break;
                    }
                    x++;
                }
            }
            k = -1;
        }
        return k;
    }
}