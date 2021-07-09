package string;

import org.junit.Assert;
import org.junit.Test;

public class TestReverseString2 {

    @Test
    public void testReverseString2() {

        ReverseString2 reverseString2 = new ReverseString2();
        char[] chArr = new char[] { 't', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e' };

        reverseString2.reverseWords(chArr);
        Assert.assertArrayEquals(
                new char[] { 'b', 'l', 'u', 'e', ' ', 'i', 's', ' ', 's', 'k', 'y', ' ', 't', 'h', 'e' }, chArr);

        chArr = new char[] { 'a' };
        reverseString2.reverseWords(chArr);
        Assert.assertArrayEquals(new char[] { 'a' }, chArr);
    }

}
