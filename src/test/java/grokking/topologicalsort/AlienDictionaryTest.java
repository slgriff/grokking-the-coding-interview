package grokking.topologicalsort;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AlienDictionaryTest {

    @Test
    public void test1() {
        String[] words = {"ba", "bc", "ac", "cab"};
        assertThat(
                AlienDictionary.solve(words),
                is("bac")
        );
    }

    @Test
    public void test2() {
        String[] words = {"cab", "aaa", "aab"};
        assertThat(
                AlienDictionary.solve(words),
                is("cab")
        );
    }

    @Test
    public void test3() {
        String[] words = {"ywx", "wz", "xww", "xz", "zyy", "zwz"};
        assertThat(
                AlienDictionary.solve(words),
                is("ywxz")
        );
    }

    @Test
    public void test4() {
        String[] words = {"wrt","wrf","er","ett","rftt"};
        assertThat(
                AlienDictionary.solve(words),
                is("wertf")
        );
    }

    @Test
    public void test5() {
        String[] words = {"z", "x"};
        assertThat(
                AlienDictionary.solve(words),
                is("zx")
        );
    }
}