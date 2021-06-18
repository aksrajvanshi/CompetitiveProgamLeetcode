package arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestFourSum {

    @Test
    public void testFourSum() {
        FourSum fourSum = new FourSum();

        List<List<Integer>> expected = new ArrayList<>(); // empty list
        expected.add(Arrays.asList(-2, 0, 0, 2));
        expected.add(Arrays.asList(-2, -1, 1, 2));
        expected.add(Arrays.asList(-1, 0, 0, 1));

        Assert.assertEquals(expected, fourSum.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0));

        expected.clear();
        expected.add(Arrays.asList(2, 2, 2, 2));

        Assert.assertEquals(expected, fourSum.fourSum(new int[] { 2, 2, 2, 2, 2 }, 8));

    }

}
