package DP;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i-1]);
        }
        return dp[dp.length - 1];
    }


    public static void main(String[] args) {
        HouseRobber h = new HouseRobber();
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(h.rob(nums1));
        int[] nums2 = {2, 7, 9, 3, 1};
        System.out.println(h.rob(nums2));
        int[] nums3 = {2, 1, 1, 2};
        System.out.println(h.rob(nums3));

    }
}
