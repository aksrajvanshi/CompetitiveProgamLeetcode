package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        int ptr = 0;
        Map<Character, Integer> hmap = new HashMap<>();
        int longestSubStr = 0;

        int tempLength = 0;

        for (int i = 0; i < s.length(); i++) {
            // if the current character is a new character
            if (!hmap.containsKey(s.charAt(i))) {
                hmap.put(s.charAt(i), i);
                tempLength++;
            } else {
                // if the current character also exists in the Map, we look at it's index
                int prevIndex = hmap.get(s.charAt(i));

                // if current pointer is less than the previous index of the repeated character,
                // we update the pointer to prevIndex + 1
                if (ptr <= prevIndex) {
                    ptr = prevIndex + 1;
                }

                tempLength = i - ptr + 1;
                hmap.put(s.charAt(i), i);

            }

            longestSubStr = Math.max(longestSubStr, tempLength);
        }

        return longestSubStr;
    }

}
