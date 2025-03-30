class Solution {
    public void sortColors(int[] nums) {
        int cnt0 = 0 , cnt1 = 0 , cnt2 = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(nums[i] == 0)
                cnt0++;
            else if(nums[i] == 1)
                cnt1++;
            else
                cnt2++;
        }
        int ind = 0;

        while(cnt0-- > 0) {
            nums[ind++] = 0;
        }

        while(cnt1-- > 0) {
            nums[ind++] = 1;
        }

        while(cnt2-- > 0) {
            nums[ind++] = 2;
        }
        
    }
}