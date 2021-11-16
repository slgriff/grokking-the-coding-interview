package grokking.binarysearch;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MinimumDifferenceElementTest {

    @Test
    public void test1() {
        int[] nums = {4, 6, 10};
        int key = 7;
        assertThat(
                MinimumDifferenceElement.solve(nums, key),
                is(6)
        );
    }

    @Test
    public void test2() {
        int[] nums = {4, 6, 10};
        int key = 4;
        assertThat(
                MinimumDifferenceElement.solve(nums, key),
                is(4)
        );
    }

    @Test
    public void test3() {
        int[] nums = {1, 3, 8, 10, 15};
        int key = 12;
        assertThat(
                MinimumDifferenceElement.solve(nums, key),
                is(10)
        );
    }

    @Test
    public void test4() {
        int[] nums = {4, 6, 10};
        int key = 17;
        assertThat(
                MinimumDifferenceElement.solve(nums, key),
                is(10)
        );
    }
}