package dfs;

import org.junit.Assert;
import org.junit.Test;

public class TestNumberOfIslands {

    @Test
    public void testNumberOfIslands() {

        NumberOfIslands numberOfIslands = new NumberOfIslands();

        Assert.assertEquals(1, numberOfIslands.numIslands(new char[][] { { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '0', '0', '0' } }));

        Assert.assertEquals(4, numberOfIslands.numIslands(new char[][] { { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '1', '0' }, { '0', '0', '1', '0', '0' }, { '0', '0', '0', '1', '1' } }));
    }
}
