package grokking.slidingwindow;

public class SmallestSubarray {
    public static int solve(int[] nums, int s) {
        int ans = -1;

        int start = 0;
        int sum = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= s) {
                if (ans == -1) {
                    ans = end - start + 1;
                } else {
                    ans = Math.min(ans, end - start + 1);
                }

                sum -= nums[start];
                start++;
            }
        }


        return ans != -1 ? ans : 0;
    }
}
