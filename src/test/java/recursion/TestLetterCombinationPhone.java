package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestLetterCombinationPhone {

    @Test
    public void testLetterCombinations() {
        LetterCombinationPhone letterCombinationPhone = new LetterCombinationPhone();

        List<String> actual = letterCombinationPhone.letterCombinations("23");
        Collections.sort(actual);

        ArrayList<String> expected = new ArrayList<String>() {
            {
                add("ad");
                add("ae");
                add("af");
                add("bd");
                add("be");
                add("bf");
                add("cd");
                add("ce");
                add("cf");
            }
        };

        Assert.assertEquals(expected, actual);

        letterCombinationPhone.result.clear();

        Assert.assertEquals(new ArrayList<String>(), letterCombinationPhone.letterCombinations(""));

        List<String> actual1 = letterCombinationPhone.letterCombinations("2");
        Collections.sort(actual1);

        ArrayList<String> expected1 = new ArrayList<String>() {
            {
                add("a");
                add("b");
                add("c");
            }
        };

        Assert.assertEquals(expected1, actual1);

    }
}
