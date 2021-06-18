package arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

public class TestThreeSum {

    @Test
    public void testThreeSum(){

        ThreeSum threeSum = new ThreeSum();

        List<List<Integer>> expected = new ArrayList<>(); // empty list
        expected.add(Arrays.asList(-1,-1,2));
        expected.add(Arrays.asList(-1,0,1));

        Assert.assertEquals(expected,threeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));

        Assert.assertEquals(new ArrayList<>(),threeSum.threeSum(new int[]{}));

        Assert.assertEquals(new ArrayList<>(),threeSum.threeSum(new int[]{0}));
    }

}
