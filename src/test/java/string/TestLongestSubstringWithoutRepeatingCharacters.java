package string;

import org.junit.Assert;
import org.junit.Test;

public class TestLongestSubstringWithoutRepeatingCharacters {

    @Test
    public void testLongestSubstringWithoutRepeatingCharacters() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));

        Assert.assertEquals(0, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));

        Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));

        Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf"));

        Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aabaab!bb"));

        Assert.assertEquals(5, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("tmmzuxt"));
    }
}
