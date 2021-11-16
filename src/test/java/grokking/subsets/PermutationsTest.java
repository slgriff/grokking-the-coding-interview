package grokking.subsets;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PermutationsTest {
    @Test
    public void test1() {
        assertThat(
                Permutations.solve(Set.of(1, 3, 5)),
                containsInAnyOrder(
                        List.of(1, 3, 5),
                        List.of(1, 5, 3),
                        List.of(3, 1, 5),
                        List.of(3, 5, 1),
                        List.of(5, 1, 3),
                        List.of(5, 3, 1)
                )
        );
    }
}