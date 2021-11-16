package grokking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Challenge3Test {
    @Test
    public void test1() {
        assertEquals("abdec", Challenge3.solve("aabdec", "abc"));
    }

    @Test
    public void test2() {
        assertEquals("bca", Challenge3.solve("abdbca", "abc"));
    }

    @Test
    public void test3() {
        assertEquals("", Challenge3.solve("adcad", "abc"));
    }
}