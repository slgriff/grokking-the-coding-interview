package grokking.subsets;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BalancedParenthesesTest {

    @Test
    public void test1() {
        assertThat(
                BalancedParentheses.solve(2),
                containsInAnyOrder("(())", "()()")
        );
    }

    @Test
    public void test2() {
        assertThat(
                BalancedParentheses.solve(3),
                containsInAnyOrder("((()))", "(()())", "(())()", "()(())", "()()()")
        );
    }

}