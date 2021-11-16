package grokking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringKDistinctTest {

    @Test
    public void test1() {
        assertEquals(4, LongestSubstringKDistinct.solve("araaci", 2));
    }

    @Test
    public void test2() {
        assertEquals(2, LongestSubstringKDistinct.solve("araaci", 1));
    }

    @Test
    public void test3() {
        assertEquals(5, LongestSubstringKDistinct.solve("cbbebi", 3));
    }


}