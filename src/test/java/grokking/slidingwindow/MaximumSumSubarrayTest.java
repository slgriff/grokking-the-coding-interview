package grokking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSumSubarrayTest {

    @Test
    public void test1() {
        assertEquals(9, MaximumSumSubarray.solve(new int[]{2, 1, 5, 1, 3, 2}, 3));
    }

    @Test
    public void test2() {
        assertEquals(7, MaximumSumSubarray.solve(new int[]{2, 3, 4, 1, 5}, 2));
    }
}
