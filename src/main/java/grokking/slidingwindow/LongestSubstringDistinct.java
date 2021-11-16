package grokking.slidingwindow;

import java.util.Map;
import java.util.HashMap;

public class LongestSubstringDistinct {
    public static int solve(String s) {
        int ans = 0;
        Map<Character, Integer> m = new HashMap<>();
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            if (m.containsKey(s.charAt(end))) {
                start = Math.max(start, m.get(s.charAt(end)) + 1);
            }

            ans = Math.max(ans, end - start + 1);

            m.put(s.charAt(end), end);
        }

        return ans;
    }
}
