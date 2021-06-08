package closestkpoints;

import org.junit.Assert;
import org.junit.Test;

public class TestKLargestElementInArray {

    @Test
    public void testKLargestElementInArray() {
        KLargestElementInArray kLargestElementInArray = new KLargestElementInArray();

        Assert.assertEquals(5, kLargestElementInArray.findKthLargest(new int[] { 3, 2, 1, 5, 6, 4 }, 2));

        Assert.assertEquals(4, kLargestElementInArray.findKthLargest(new int[] { 3, 2, 3, 1, 2, 4, 5, 5, 6 }, 4));
    }

}
