package grokking.slidingwindow;

public class MaximumSumSubarray {

    public static int solve(int[] nums, int k) {
        int ans = 0;
        int start = 0;
        int sum = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            if (end >= k-1) {
                ans = Math.max(ans, sum);
                sum -= nums[start];
                start++;
            }
        }


        return ans;
    }
}
