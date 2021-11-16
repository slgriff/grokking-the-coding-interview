package grokking.binarysearch;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Challenge1Test {

    @Test
    public void test1() {
        int[] nums = {1, 3, 8, 4, 3};
        int key = 4;
        assertThat(
                Challenge1.solve(nums, key),
                is(3)
        );
    }

    @Test
    public void test2() {
        int[] nums = {3, 8, 3, 1};
        int key = 8;
        assertThat(
                Challenge1.solve(nums, key),
                is(1)
        );
    }

    @Test
    public void test3() {
        int[] nums = {1, 3, 8, 12};
        int key = 12;
        assertThat(
                Challenge1.solve(nums, key),
                is(3)
        );
    }

    @Test
    public void test4() {
        int[] nums = {10, 9, 8};
        int key = 10;
        assertThat(
                Challenge1.solve(nums, key),
                is(0)
        );
    }
}