package grokking.twopointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareSortedArrayTest {

    @Test
    public void test1() {
        int[] expected = {0, 1, 4, 4, 9};
        int[] nums = {-2, -1, 0, 2, 3};
        assertArrayEquals(expected, SquareSortedArray.solve(nums));
    }

    @Test
    public void test2() {
        int[] expected = {0, 1, 1, 4, 9};
        int[] nums = {-3, -1, 0, 1, 2};
        assertArrayEquals(expected, SquareSortedArray.solve(nums));
    }

    @Test
    public void test3() {
        int[] expected = {0, 1, 9, 16, 100};
        int[] nums = {-4, -1, 0, 3, 10};
        assertArrayEquals(expected, SquareSortedArray.solve(nums));
    }

    @Test
    public void test4() {
        int[] expected = {4, 9, 9, 49, 121};
        int[] nums = {-7, -3, 2, 3, 11};
        assertArrayEquals(expected, SquareSortedArray.solve(nums));
    }

}