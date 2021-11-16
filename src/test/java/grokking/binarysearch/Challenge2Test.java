package grokking.binarysearch;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Challenge2Test {
    @Test
    public void test1() {
        int[] nums = {10, 15, 1, 3, 8};
        int key = 15;
        assertThat(
                Challenge2.solve(nums, key),
                is(1)
        );
    }

    @Test
    public void test2() {
        int[] nums = {4, 5, 7, 9, 10, -1, 2};
        int key = 10;
        assertThat(
                Challenge2.solve(nums, key),
                is(4)
        );
    }
}