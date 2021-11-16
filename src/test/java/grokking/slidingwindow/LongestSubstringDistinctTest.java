package grokking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringDistinctTest {

    @Test
    public void test1() {
        assertEquals(3, LongestSubstringDistinct.solve("aabccbb"));
    }

    @Test
    public void test2() {
        assertEquals(2, LongestSubstringDistinct.solve("abbbb"));
    }

    @Test
    public void test3() {
        assertEquals(3, LongestSubstringDistinct.solve("abccde"));
    }
}