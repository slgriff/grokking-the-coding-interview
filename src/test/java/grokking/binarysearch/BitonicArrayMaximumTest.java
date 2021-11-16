package grokking.binarysearch;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BitonicArrayMaximumTest {

    @Test
    public void test1() {
        int[] nums = {1, 3, 8, 12, 4, 2};
        assertThat(
                BitonicArrayMaximum.solve(nums),
                is(12)
        );
    }

    @Test
    public void test2() {
        int[] nums = {3, 8, 3, 1};
        assertThat(
                BitonicArrayMaximum.solve(nums),
                is(8)
        );
    }

    @Test
    public void test3() {
        int[] nums = {1, 3, 8, 12};
        assertThat(
                BitonicArrayMaximum.solve(nums),
                is(12)
        );
    }
    @Test
    public void test4() {
        int[] nums = {10, 9, 8};
        assertThat(
                BitonicArrayMaximum.solve(nums),
                is(10)
        );
    }
}