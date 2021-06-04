/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any
 * order.
 *
 * <p>An Anagram is a word or phrase formed by rearranging the letters of a different word or
 * phrase, typically using all the original letters exactly once.
 */
package arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();

        if (strs.length == 0) {
            return res;
        }

        Map<String, List<String>> hmap = new HashMap<>();

        for (String s : strs) {

            char[] chArr = s.toCharArray();
            Arrays.sort(chArr);
            String sortedString = new String(chArr);

            if (!hmap.containsKey(sortedString)) {
                List<String> temp = new ArrayList<>();
                temp.add(s);
                hmap.put(sortedString, temp);
            } else {
                List<String> temp = hmap.get(sortedString);
                temp.add(s);
                hmap.put(sortedString, temp);
            }
        }

        for (String key : hmap.keySet()) {
            res.add(hmap.get(key));
        }

        return res;
    }
}
