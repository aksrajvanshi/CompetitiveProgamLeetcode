package dp;

import org.junit.Assert;
import org.junit.Test;

public class TestMaxLengthOfRepeatedSubArray {

    @Test
    public void testMaxLengthOfRepeatedSubArray(){
        MaxLengthOfRepeatedSubArray maxLengthOfRepeatedSubArray = new MaxLengthOfRepeatedSubArray();

        Assert.assertEquals(3, maxLengthOfRepeatedSubArray.findLength(
                new int[]{1,2,3,2,1},
                new int[]{3,2,1,4,7}
        ));

        Assert.assertEquals(5, maxLengthOfRepeatedSubArray.findLength(
                new int[]{0,0,0,0,0},
                new int[]{0,0,0,0,0}
        ));
    }

}
