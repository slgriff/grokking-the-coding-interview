package grokking.binarysearch;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Challenge3Test {

    @Test
    public void test1() {
        int[] nums = {10, 15, 1, 3, 8};
        assertThat(
                Challenge3.solve(nums),
                is(2)
        );
    }

    @Test
    public void test2() {
        int[] nums = {4, 5, 7, 9, 10, -1, 2};
        assertThat(
                Challenge3.solve(nums),
                is(5)
        );
    }

    @Test
    public void test3() {
        int[] nums = {1, 3, 8, 10};
        assertThat(
                Challenge3.solve(nums),
                is(0)
        );
    }

}