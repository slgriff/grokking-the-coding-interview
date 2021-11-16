package grokking.binarysearch;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class NumberCeilingTest {

    @Test
    public void test1() {
        int[] nums = {4, 6, 10};
        int key = 6;
        assertThat(
                NumberCeiling.solve(nums, key),
                is(1)
        );
    }

    @Test
    public void test2() {
        int[] nums = {1, 3, 5, 8, 10, 15};
        int key = 12;
        assertThat(
                NumberCeiling.solve(nums, key),
                is(4)
        );
    }

    @Test
    public void test3() {
        int[] nums = {4, 6, 10};
        int key = 17;
        assertThat(
                NumberCeiling.solve(nums, key),
                is(-1)
        );
    }

    @Test
    public void test4() {
        int[] nums = {4, 6, 10};
        int key = -1;
        assertThat(
                NumberCeiling.solve(nums, key),
                is(0)
        );
    }
}