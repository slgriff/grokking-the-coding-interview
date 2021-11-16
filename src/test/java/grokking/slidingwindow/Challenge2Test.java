package grokking.slidingwindow;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Challenge2Test {
    @Test
    public void test1() {
        assertEquals(List.of(1, 2), Challenge2.solve("ppqp", "pq"));
    }

    @Test
    public void test2() {
        assertEquals(List.of(2, 3, 4), Challenge2.solve("abbcabc", "abc"));
    }
}