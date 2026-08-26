import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

/*
Valid Parentheses problem
Given a string containing just the characters (, ), {, }, [ and ], determine if the input string is valid — every open bracket 
must be closed by the same type of bracket and in the correct order.
Difficulty: Easy
Time Complexity O(n^2)
Space Complexity O(1)
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> complements = new HashMap<>(Map.of(
            '(', ')',
            '{', '}',
            '[', ']'
        ));
        Character[] opening = {'(', '{', '['};
        List<Character> openningSymbols = Arrays.asList(opening);
        for (int i = 0; i < s.length(); i++) {
            int search = 0;
            if (openningSymbols.contains(s.charAt(i))) {
                getOut:
                for (int j = i + 1; j < s.length(); j++) {
                    if (openningSymbols.contains(s.charAt(j))) {
                        search++;
                        continue;
                    }
                    if (search == 0) {
                        if (complements.get(s.charAt(i)) != s.charAt(j)) {
                            return false;
                        }
                        break getOut;
                    }
                    search--;
                }
            }
            continue;
        }
        return true;
    }
}
