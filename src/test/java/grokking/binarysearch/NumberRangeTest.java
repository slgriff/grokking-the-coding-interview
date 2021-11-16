package grokking.binarysearch;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.Assert.assertArrayEquals;

public class NumberRangeTest {

    @Test
    public void test1() {
        int[] expected = {1, 3};
        int[] nums = {4, 6, 6, 6, 9};
        int key = 6;
        assertArrayEquals(expected, NumberRange.solve(nums, key));
    }

    @Test
    public void test2() {
        int[] expected = {3, 3};
        int[] nums = {1, 3, 8, 10, 15};
        int key = 6;
        assertArrayEquals(expected, NumberRange.solve(nums, key));
    }

    @Test
    public void test3() {
        int[] expected = {-1, -1};
        int[] nums = {1, 3, 8, 10, 15};
        int key = 12;
        assertArrayEquals(expected, NumberRange.solve(nums, key));
    }
}