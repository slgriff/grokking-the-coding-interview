package grokking.subsets;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UniqueGeneralizedAbbreviationsTest {

    @Test
    public void test1() {
        assertThat(
                UniqueGeneralizedAbbreviations.solve("BAT"),
                containsInAnyOrder("BAT", "BA1", "B1T", "B2", "1AT", "1A1", "2T", "3")
        );
    }

    @Test
    public void test2() {
        assertThat(
                UniqueGeneralizedAbbreviations.solve("code"),
                containsInAnyOrder("code", "cod1", "co1e", "co2", "c1de", "c1d1", "c2e", "c3", "1ode", "1od1", "1o1e", "1o2", "2de", "2d1", "3e", "4")
        );
    }

}