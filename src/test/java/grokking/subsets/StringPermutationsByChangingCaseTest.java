package grokking.subsets;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StringPermutationsByChangingCaseTest {

    @Test
    public void test1() {
        assertThat(
                StringPermutationsByChangingCase.solve("ad52"),
                containsInAnyOrder("ad52", "Ad52", "aD52", "AD52")
        );
    }

    @Test
    public void test2() {
        assertThat(
                StringPermutationsByChangingCase.solve("ab7c"),
                containsInAnyOrder("ab7c", "Ab7c", "aB7c", "AB7c", "ab7C", "Ab7C", "aB7C", "AB7C")
        );
    }

}