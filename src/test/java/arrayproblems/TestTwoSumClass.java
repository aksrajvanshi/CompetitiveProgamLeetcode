package arrayproblems;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TestTwoSumClass {

    @Test
    public void testTwoSumEasy() {

        int[] array1 = new int[] { 2, 7, 11, 15 };
        int target1 = 9;

        TwoSumEasy twoSumTestObject = new TwoSumEasy();

        int[] actualResult = twoSumTestObject.twoSum(array1, target1);
        Arrays.sort(actualResult);

        Assert.assertArrayEquals(new int[] { 0, 1 }, actualResult);

        int[] array2 = new int[] { 3, 2, 4 };
        int target2 = 6;

        int[] actualResult2 = twoSumTestObject.twoSum(array2, target2);
        Arrays.sort(actualResult2);

        Assert.assertArrayEquals(new int[] { 1, 2 }, actualResult2);

        int[] array3 = new int[] { 3, 3 };
        int target3 = 6;

        int[] actualResult3 = twoSumTestObject.twoSum(array3, target3);
        Arrays.sort(actualResult3);

        Assert.assertArrayEquals(new int[] { 0, 1 }, actualResult3);

    }

}
