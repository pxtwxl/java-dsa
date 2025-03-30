class Solution {
    public int maxSubArray(int[] nums) {
        long n = nums.length;
        long sum = 0;
        int startInd = -1 , endInd = -1;
        long maxi = Long.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            
            if(sum == 0) startInd = i;
            
            sum += nums[i];

            if(sum > maxi) {
                maxi = sum;

                startInd = i;
                endInd = i;
            }

            if(sum < 0)
                sum = 0;
        }

        
        System.out.print("SubArray : ");
        for(int ind = startInd; ind <= endInd; ind++) {
            System.out.print(nums[ind] + " ");
        }

        return (int)(maxi);
    }
}