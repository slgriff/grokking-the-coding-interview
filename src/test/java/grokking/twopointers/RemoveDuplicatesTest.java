package grokking.twopointers;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    @Test
    public void test1() {
        int[] expected = {2, 3, 6, 9};

        int[] nums = {2, 3, 3, 3, 6, 9, 9};

        assertEquals(4, RemoveDuplicates.solve(nums));
        assertTrue(Arrays.equals(expected, 0, expected.length, nums, 0, 5));
    }

    @Test
    public void test2() {
        int[] expected = {2, 11};

        int[] nums = {2, 2, 2, 11};

        assertEquals(2, RemoveDuplicates.solve(nums));
        assertTrue(Arrays.equals(expected, 0, expected.length, nums, 0, 3));
    }

}