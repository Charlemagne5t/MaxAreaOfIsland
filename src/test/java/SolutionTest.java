import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxAreaOfIslandTest1() {
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        Assert.assertEquals(6, new Solution().maxAreaOfIsland(grid));
    }

    @Test
    public void maxAreaOfIslandTest2() {
        int[][] grid = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},

        };
        Assert.assertEquals(0, new Solution().maxAreaOfIsland(grid));
    }
    @Test
    public void maxAreaOfIslandTest3() {
        int[][] grid = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,0,1,1},
                {0,0,0,1,1}
        };
        Assert.assertEquals(4, new Solution().maxAreaOfIsland(grid));
    }
    @Test
    public void maxAreaOfIslandTest4() {
        int[][] grid = {
                {1,0,0},
                {0,1,1},
        };
        Assert.assertEquals(2, new Solution().maxAreaOfIsland(grid));
    }

    @Test
    public void maxAreaOfIslandTest5() {
        int[][] grid = {
                {1}
        };
        Assert.assertEquals(1, new Solution().maxAreaOfIsland(grid));
    }


}


