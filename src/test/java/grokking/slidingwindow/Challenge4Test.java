package grokking.slidingwindow;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Challenge4Test {
    @Test
    public void test1() {
        assertEquals(List.of(0, 3), Challenge4.solve("catfoxcat", List.of("cat", "fox")));
    }

    @Test
    public void test2() {
        assertEquals(List.of(3), Challenge4.solve("catcatfoxfox", List.of("cat", "fox")));
    }
}