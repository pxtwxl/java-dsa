class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int cnt = 1;
        Arrays.sort(nums);

        for(int i = 0; i < n-1; i++) {
            if(nums[i] == nums[i+1]) {
                cnt++;
            } else {
                cnt = 1;
            }

            if(cnt > n/2)
                return nums[i];
        } 

        return -1;
    }
}