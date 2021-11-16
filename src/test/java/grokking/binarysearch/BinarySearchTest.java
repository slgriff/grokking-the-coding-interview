package grokking.binarysearch;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BinarySearchTest {

    @Test
    public void test1() {
        int[] nums = {4, 6, 10};
        int key = 10;
        assertThat(
                BinarySearch.solve(nums, key),
                equalTo(2)
        );
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int key = 5;
        assertThat(
                BinarySearch.solve(nums, key),
                equalTo(4)
        );
    }

    @Test
    public void test3() {
        int[] nums = {10, 6, 4};
        int key = 10;
        assertThat(
                BinarySearch.solve(nums, key),
                equalTo(0)
        );
    }

    @Test
    public void test4() {
        int[] nums = {10, 6, 4};
        int key = 4;
        assertThat(
                BinarySearch.solve(nums, key),
                equalTo(2)
        );
    }

    @Test
    public void test5() {
        int[] nums = {2, 8, 11, 19};
        int key = 11;
        assertThat(
                BinarySearch.solve(nums, key),
                equalTo(2)
        );
    }

    @Test
    public void test6() {
        int[] nums = {32, 28, 17, 9, 3};
        int key = 9;
        assertThat(
                BinarySearch.solve(nums, key),
                equalTo(3)
        );
    }
}