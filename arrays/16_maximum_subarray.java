class Solution {
    public int maxSubArray(int[] nums) {
        long n = nums.length;
        long sum = 0;
        long maxi = Long.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            sum += nums[i];

            maxi = Math.max(sum,maxi);

            if(sum < 0)
                sum = 0;
        }

        return (int)(maxi);
    }
}