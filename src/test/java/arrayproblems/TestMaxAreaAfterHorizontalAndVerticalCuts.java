package arrayproblems;

import org.junit.Assert;
import org.junit.Test;

public class TestMaxAreaAfterHorizontalAndVerticalCuts {

    @Test
    public void testMaxAreaAfterHorizontalAndVerticalCuts() {
        MaxAreaAfterHorizontalAndVerticalCuts maxAreaAfterHorizontalAndVerticalCuts = new MaxAreaAfterHorizontalAndVerticalCuts();

        Assert.assertEquals(4,
                maxAreaAfterHorizontalAndVerticalCuts.maxArea(5, 4, new int[] { 1, 2, 4 }, new int[] { 1, 3 }));

        Assert.assertEquals(6,
                maxAreaAfterHorizontalAndVerticalCuts.maxArea(5, 4, new int[] { 3, 1 }, new int[] { 1 }));

        Assert.assertEquals(9, maxAreaAfterHorizontalAndVerticalCuts.maxArea(5, 4, new int[] { 3 }, new int[] { 3 }));
    }

}
