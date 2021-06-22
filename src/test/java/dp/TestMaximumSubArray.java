package dp;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumSubArray {

    @Test
    public void testMaximumSubArray() {
        MaximumSubArray maximumSubArray = new MaximumSubArray();

        Assert.assertEquals(6, maximumSubArray.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));

        Assert.assertEquals(1, maximumSubArray.maxSubArray(new int[] { 1 }));

        Assert.assertEquals(23, maximumSubArray.maxSubArray(new int[] { 5, 4, -1, 7, 8 }));

        Assert.assertEquals(6, maximumSubArray.maxSubArray(new int[] { 1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4 }));

        Assert.assertEquals(-1, maximumSubArray.maxSubArray(new int[] { -1, -2 }));
    }
}
