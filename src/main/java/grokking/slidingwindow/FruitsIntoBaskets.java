package grokking.slidingwindow;

import java.util.Map;
import java.util.HashMap;

public class FruitsIntoBaskets {
    public static int solve(char[] arr) {

        int ans = 0;

        Map<Character, Integer> m = new HashMap<>();
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            m.put(arr[end], m.getOrDefault(arr[end], 0) + 1);
            while (m.size() > 2) {
                m.put(arr[start], m.get(arr[start]) - 1);
                if (m.get(arr[start]) == 0) {
                    m.remove(arr[start]);
                }
                start++;
            }

            ans = Math.max(ans, end - start + 1);
        }

        return ans;
    }
}
