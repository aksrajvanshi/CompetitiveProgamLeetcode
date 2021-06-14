package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LetterCombinationPhone {

    Set<String> result = new HashSet<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] letters = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        String numString = "";

        helper(digits, letters, numString, 0);

        return result.stream().collect(Collectors.toList());
    }

    public void helper(String digits, String[] letters, String numString, int idx) {

        if (idx == digits.length()) {
            if (!result.contains(numString)) {
                result.add(numString);
            }
            return;
        }

        String curString = letters[digits.charAt(idx) - '0'];
        for (int i = 0; i < curString.length(); i++) {
            helper(digits, letters, numString + curString.charAt(i), idx + 1);
        }

    }

}
