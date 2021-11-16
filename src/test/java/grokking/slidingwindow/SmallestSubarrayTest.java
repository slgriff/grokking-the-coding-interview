package grokking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestSubarrayTest {

    @Test
    public void test1() {
        assertEquals(2, SmallestSubarray.solve(new int[]{2, 1, 5, 2, 3, 2}, 7));
    }

    @Test
    public void test2() {
        assertEquals(1, SmallestSubarray.solve(new int[]{2, 1, 5, 2, 8}, 7));
    }

    @Test
    public void test3() {
        assertEquals(3, SmallestSubarray.solve(new int[]{3, 4, 1, 1, 6}, 8));
    }

}