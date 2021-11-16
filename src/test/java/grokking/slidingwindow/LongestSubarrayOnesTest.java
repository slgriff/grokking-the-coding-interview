package grokking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubarrayOnesTest {

    @Test
    public void test1() {
        assertEquals(6, LongestSubarrayOnes.solve(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1}, 2));
    }

    @Test
    public void test2() {
        assertEquals(9, LongestSubarrayOnes.solve(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1}, 3));
    }

}