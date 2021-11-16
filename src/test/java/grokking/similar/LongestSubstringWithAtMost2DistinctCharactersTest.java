package grokking.similar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithAtMost2DistinctCharactersTest {
    @Test
    public void test1() {
        assertEquals(4, LongestSubstringWithAtMost2DistinctCharacters.solve("araaci"));
    }
}