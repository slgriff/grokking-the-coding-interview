package grokking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Challenge1Test {

    @Test
    public void test1() {
        assertTrue(Challenge1.solve("oidbcaf", "abc"));
    }

    @Test
    public void test2() {
        assertFalse(Challenge1.solve("odicf", "dc"));
    }

    @Test
    public void test3() {
        assertTrue(Challenge1.solve("bcdxabcdy", "bcdyabcdx"));
    }

    @Test
    public void test4() {
        assertTrue(Challenge1.solve("aaacb", "abc"));
    }
}