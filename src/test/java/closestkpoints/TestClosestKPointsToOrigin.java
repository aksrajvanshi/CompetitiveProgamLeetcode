package closestkpoints;

import org.junit.Assert;
import org.junit.Test;

public class TestClosestKPointsToOrigin {

    @Test
    public void testClosestKPointsToOrigin() {
        ClosestKPointsToOrigin closestKPoints = new ClosestKPointsToOrigin();

        Assert.assertArrayEquals(new int[][] { { 3, 3 }, { -2, 4 } },
                closestKPoints.kClosest(new int[][] { { 3, 3 }, { 5, -1 }, { -2, 4 } }, 2));

        Assert.assertArrayEquals(new int[][] { { -2, 2 } },
                closestKPoints.kClosest(new int[][] { { 1, 3 }, { -2, 2 } }, 1));
    }

}
