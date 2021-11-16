package grokking.subsets;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Challenge3Test {

    @Test
    public void test1() {
        assertThat(
                Challenge3.solve(2),
                equalTo(2)
        );
    }

    @Test
    public void test2() {
        assertThat(
                Challenge3.solve(3),
                equalTo(5)
        );
    }

    @Test
    public void test3() {
        assertThat(
                Challenge3.solve(1),
                equalTo(1)
        );
    }

}