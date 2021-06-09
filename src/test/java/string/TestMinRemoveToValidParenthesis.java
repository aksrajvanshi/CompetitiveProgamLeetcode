package string;

import org.junit.Assert;
import org.junit.Test;

public class TestMinRemoveToValidParenthesis {

    @Test
    public void testMinRemoveToValidParenthesis() {

        MinRemoveToValidParenthesis minRemoveToValidParenthesis = new MinRemoveToValidParenthesis();
        Assert.assertEquals("lee(t(c)o)de", minRemoveToValidParenthesis.minRemoveToMakeValid("lee(t(c)o)de)"));

        Assert.assertEquals("ab(c)d", minRemoveToValidParenthesis.minRemoveToMakeValid("a)b(c)d"));

        Assert.assertEquals("", minRemoveToValidParenthesis.minRemoveToMakeValid("))(("));

        Assert.assertEquals("a(b(c)d)", minRemoveToValidParenthesis.minRemoveToMakeValid("(a(b(c)d)"));

        Assert.assertEquals("", minRemoveToValidParenthesis.minRemoveToMakeValid("("));
    }

}
