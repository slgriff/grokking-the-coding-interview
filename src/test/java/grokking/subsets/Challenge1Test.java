package grokking.subsets;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Challenge1Test {

    @Test
    public void test1() {
        assertThat(
                Challenge1.solve("1+2*3"),
                containsInAnyOrder(7, 9)
        );
    }

    @Test
    public void test2() {
        assertThat(
                Challenge1.solve("2*3-4-5"),
                containsInAnyOrder(8, -12, 7, -7, -3)
        );
    }

}