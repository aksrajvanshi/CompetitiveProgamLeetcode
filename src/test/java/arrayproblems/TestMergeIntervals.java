package arrayproblems;

import org.junit.Assert;
import org.junit.Test;

public class TestMergeIntervals {

    @Test
    public void testMergeIntervals() {

        MergeIntervalsMedium mergeIntervalsMedium = new MergeIntervalsMedium();

        Assert.assertArrayEquals(new int[][] {}, mergeIntervalsMedium.merge(new int[][] {}));

        Assert.assertArrayEquals(new int[][] { { 1, 100 } }, mergeIntervalsMedium.merge(new int[][] { { 1, 100 } }));

        Assert.assertArrayEquals(new int[][] { { 1, 6 }, { 8, 10 }, { 15, 18 } },
                mergeIntervalsMedium.merge(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } }));

        Assert.assertArrayEquals(new int[][] { { 1, 5 } },
                mergeIntervalsMedium.merge(new int[][] { { 1, 4 }, { 4, 5 } }));

        Assert.assertArrayEquals(new int[][] { { 1, 5 }, { 8, 10 } },
                mergeIntervalsMedium.merge(new int[][] { { 1, 4 }, { 4, 5 }, { 8, 10 } }));

        Assert.assertArrayEquals(new int[][] { { 1, 5 }, { 8, 10 } },
                mergeIntervalsMedium.merge(new int[][] { { 1, 4 }, { 8, 10 }, { 4, 5 } }));
    }
}
