package grokking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FruitsIntoBasketsTest {

    @Test
    public void test1() {
        assertEquals(3, FruitsIntoBaskets.solve(new char[]{'A', 'B', 'C', 'A', 'C'}));
    }

    @Test
    public void test2() {
        assertEquals(5, FruitsIntoBaskets.solve(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}));
    }
}