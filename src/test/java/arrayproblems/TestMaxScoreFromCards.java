package arrayproblems;

import org.junit.Assert;
import org.junit.Test;

public class TestMaxScoreFromCards {

    @Test
    public void testMaxScoreFromCards() {

        MaxScoreFromCards maxScoreFromCards = new MaxScoreFromCards();

        Assert.assertEquals(12, maxScoreFromCards.maxScore(new int[] { 1, 2, 3, 4, 5, 6, 1 }, 3));

        Assert.assertEquals(6, maxScoreFromCards.maxScore(new int[] { 2, 2, 2 }, 3));

        Assert.assertEquals(1, maxScoreFromCards.maxScore(new int[] { 1, 1000, 1 }, 1));

        Assert.assertEquals(202, maxScoreFromCards.maxScore(new int[] { 1, 79, 80, 1, 1, 1, 200, 1 }, 3));

    }

}
