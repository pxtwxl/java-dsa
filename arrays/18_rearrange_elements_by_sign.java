class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int i1 = 0 , i2 = 0;

        for(int ind = 0; ind < n; ind++) {
            if(nums[ind] > 0 && i1 < n/2) {
                pos[i1] = nums[ind];
                i1++;
            } else if (nums[ind] < 0 && i2 < n/2){
                neg[i2] = nums[ind];
                i2++;
            }
        }

        i1 = 0 ; i2 = 0;
        for(int ind = 0; ind < n; ind++) {
            if(ind % 2 != 1) {
                nums[ind] = pos[i1++];
            } else {
                nums[ind] = neg[i2++];
            }
        }

        return nums;
    }
}