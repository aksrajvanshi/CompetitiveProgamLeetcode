package string;

import org.junit.Assert;
import org.junit.Test;

public class TestIntegerToRoman {

    @Test
    public void testIntToRoman() {
        IntegerToRoman integerToRoman = new IntegerToRoman();

        Assert.assertEquals("III", integerToRoman.intToRoman(3));

        Assert.assertEquals("IV", integerToRoman.intToRoman(4));

        Assert.assertEquals("IX", integerToRoman.intToRoman(9));

        Assert.assertEquals("LVIII", integerToRoman.intToRoman(58));

        Assert.assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
    }
}
