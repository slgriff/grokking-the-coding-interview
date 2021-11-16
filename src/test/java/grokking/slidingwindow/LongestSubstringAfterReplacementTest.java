package grokking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringAfterReplacementTest {

    @Test
    public void test1() {
        assertEquals(5, LongestSubstringAfterReplacement.solve("aabccbb", 2));
    }

    @Test
    public void test2() {
        assertEquals(4, LongestSubstringAfterReplacement.solve("abbcb", 1));
    }

    @Test
    public void test3() {
        assertEquals(3, LongestSubstringAfterReplacement.solve("abccde", 1));
    }

}