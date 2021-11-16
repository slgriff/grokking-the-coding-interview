package grokking.slidingwindow;

import java.util.Map;
import java.util.HashMap;

public class LongestSubstringAfterReplacement {

    public static int solve(String s, int k) {
        int ans = 0;

        Map<Character, Integer> m = new HashMap<>();
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            m.put(s.charAt(end), m.getOrDefault(s.charAt(end), 0) + 1);
            while (end - start + 1 - m.get(s.charAt(start)) > k) {
                m.put(s.charAt(start), m.get(s.charAt(start)) - 1);
                start++;
            }

            ans = Math.max(ans, end - start + 1);
        }

        return ans;
    }
}
