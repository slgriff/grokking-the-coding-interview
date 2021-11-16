package grokking.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void test1() {
        int[] expected = {1, 3};
        int[] nums = {1, 2, 3, 4, 6};

        assertArrayEquals(expected, TwoSum.solve(nums, 6));
    }

    @Test
    public void test2() {
        int[] expected = {0, 2};
        int[] nums = {2, 5, 9, 11};

        assertArrayEquals(expected, TwoSum.solve(nums, 11));
    }

}