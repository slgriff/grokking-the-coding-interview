package grokking.twopointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class DutchNationalFlagTest {

    @Test
    public void test1() {
        int[] expected = {0, 0, 1, 1, 2};
        int[] nums = {1, 0, 2, 1, 0};
        DutchNationalFlag.solve(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test2() {
        int[] expected = {0, 0, 1, 2, 2, 2};
        int[] nums = {2, 2, 0, 1, 2, 0};
        DutchNationalFlag.solve(nums);
        assertArrayEquals(expected, nums);
    }

}