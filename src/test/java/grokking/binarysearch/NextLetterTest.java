package grokking.binarysearch;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class NextLetterTest {

    @Test
    public void test1() {
        char[] letters = {'a', 'c', 'f', 'h'};
        char key = 'f';
        assertThat(
                NextLetter.solve(letters, key),
                equalTo('h')
        );
    }

    @Test
    public void test2() {
        char[] letters = {'a', 'c', 'f', 'h'};
        char key = 'b';
        assertThat(
                NextLetter.solve(letters, key),
                equalTo('c')
        );
    }

    @Test
    public void test3() {
        char[] letters = {'a', 'c', 'f', 'h'};
        char key = 'm';
        assertThat(
                NextLetter.solve(letters, key),
                equalTo('a')
        );
    }

    @Test
    public void test4() {
        char[] letters = {'a', 'c', 'f', 'h'};
        char key = 'h';
        assertThat(
                NextLetter.solve(letters, key),
                equalTo('a')
        );
    }

}