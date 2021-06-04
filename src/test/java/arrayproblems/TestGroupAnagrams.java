package arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestGroupAnagrams {

    @Test
    public void testGroupAnagrams() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();

        List<List<String>> expectedList = new ArrayList<>();

        expectedList.add(0, new ArrayList<>(Arrays.asList("eat", "tea", "ate")));
        expectedList.add(1, new ArrayList<>(Arrays.asList("bat")));
        expectedList.add(2, new ArrayList<>(Arrays.asList("tan", "nat")));

        Assert.assertTrue(expectedList
                .equals(groupAnagrams.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" })));

        List<List<String>> expectedList1 = new ArrayList<>();
        expectedList1.add(0, new ArrayList<>(Arrays.asList("")));

        Assert.assertTrue(expectedList1.equals(groupAnagrams.groupAnagrams(new String[] { "" })));

        List<List<String>> expectedList2 = new ArrayList<>();
        expectedList2.add(0, new ArrayList<>(Arrays.asList("a")));

        Assert.assertTrue(expectedList2.equals(groupAnagrams.groupAnagrams(new String[] { "a" })));
    }
}
